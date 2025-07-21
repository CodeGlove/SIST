package emp.action;

import mybatis.dao.EmpDAO;
import mybatis.vo.EmpVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class SearchAction2 implements Action{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String searchType = request.getParameter("searchType");
        String searchValue = request.getParameter("searchValue");
        System.out.println("searchType:"+searchType);
        System.out.println("searchValue:"+searchValue);
        Map<String, String> map = new HashMap<>();
        map.put("searchType", searchType);
        map.put("searchValue", searchValue);
        EmpVO[] ar = EmpDAO.search(map);
        request.setAttribute("ar", ar);
        return "jsp/search2.jsp";
    }
}
