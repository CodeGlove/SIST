package ex3;

import mybatis.dao.DeptDAO;
import mybatis.dao.EmpDAO;
import mybatis.vo.DeptVO;
import mybatis.vo.EmpVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeptAction implements Action {
@Override
    public String execute(HttpServletRequest request, HttpServletResponse response){
        //사원목록 가져오기
        DeptVO[] ar = DeptDAO.getAll();

        //부서목록을 가져와서 request에 저장하는 것이 못적이다!

        request.setAttribute("dept", ar);
        return "ex3/dept.jsp";


    }

}
