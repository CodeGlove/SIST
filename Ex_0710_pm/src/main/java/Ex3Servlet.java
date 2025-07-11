import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/Ex3Servlet")
public class Ex3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType();
        //응답시 한글처리

        String searchType = request.getParameter("searchType");
        String searchValue = request.getParameter("searchValue");

        Map<String, String> map = new HashMap<>();
        map.put("searchType", searchType);
        map.put("searchValue", searchValue);
        List<EmpVO> ar = ss.selectList("emp.search1", map);

        ar.toArray(ar);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
