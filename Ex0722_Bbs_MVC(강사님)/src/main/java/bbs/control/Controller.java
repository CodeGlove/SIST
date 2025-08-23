package bbs.control;

import bbs.action.Action;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

    // Properties파일의 경로를 저장하자!
    private String myParam = "/WEB-INF/action.properties";

    // 위의 myParam이라는 값이 action.properties의 경로를 가지고
    // 그 파일의 내용(클래스의 경로)들을 가져와서 객체로 생성한 후
    // 생성된 객체의 주소를 아래의 Map구조에 저장한다.
    private Map<String, Action> actionMap;

    public Controller(){
        actionMap = new HashMap<>();
    }

    @Override
    public void init() throws ServletException {
        ServletContext application = this.getServletContext();
        String realPath = application.getRealPath(myParam);
        //절대경로화 시킨 이유는 해당 파일의 내용을 스트림을 이용하여
        //읽어와서 Properties객체에 담기 위함이다.
        Properties prop = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(realPath);
            prop.load(fis);//action.properties파일의 내용들을 읽어서 비어있던 Properties객체에 키와 값을 쌍으로 저장한다
        } catch (Exception e) {
            e.printStackTrace();
        }
        //생성할 객체들의 경로가 모두 Properties객체로 저장된 상태다
        //하지만 현재 컨트롤러 입장에서는 생성할 객체가 몇개이며 어떤객체인지 알지 못한다
        //Properties에 저장된 키들을 모두 가져와서
        //반복자로 수행해야 한다.
        Iterator<Object> it = prop.keySet().iterator();

        while(it.hasNext()){
            String key = (String) it.next();
            String value = prop.getProperty(key);

            try{
                Object obj = Class.forName(value).newInstance();
                actionMap.put(key, (Action) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-u");
        //요청시 한글처리
        //type이라는 파라미터 받기
        String type = request.getParameter("type");
        if(type ==null)
            type = "list";
        //type으로 받은 값이 actionMap의 key로 사용되고 있으므로
        //원하는 객체를 얻어내자!
        Action action = actionMap.get(type);
        String viewPath = action.execute(request, response);
        //viewPath가 null이면 현재 컨트롤러를 sendRedirect로 다시 호출되도록 한다.
        if(viewPath == null)
            response.sendRedirect("Controller");
        else{
            RequestDispatcher disp = request.getRequestDispatcher("viewPath");
            disp.forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
