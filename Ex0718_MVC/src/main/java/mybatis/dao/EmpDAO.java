package mybatis.dao;

import mybatis.service.FactoryService;
import mybatis.vo.EmpVO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class EmpDAO {

    public static EmpVO[] getAll() {
        SqlSession ss = FactoryService.getFactory().openSession();
        EmpVO[] ar = null;
        List<EmpVO> list = ss.selectList("emp.all");
        if (list != null && !list.isEmpty()) {
            ar = new EmpVO[list.size()];
            list.toArray(ar);
        }
        ss.close();
        return ar;
    }

    public static int add(EmpVO vo) {
        int cnt = 0;
        SqlSession ss = FactoryService.getFactory().openSession();
        cnt = ss.insert("emp.add", vo);
        if (cnt > 0)
            ss.commit();
        else
            ss.rollback();
        ss.close();

        return cnt;
    }

    public static EmpVO[] search(Map<String, String> map) {
        SqlSession ss = FactoryService.getFactory().openSession();
        EmpVO[] ar = null;
        List<EmpVO> list = ss.selectList("emp.search", map);
        if (list != null && !list.isEmpty()) {
            //Db로부터 받은 것이 있다면 배열을 생성한다.
            ar = new EmpVO[list.size()];
            list.toArray(ar);
        }
        ss.close();
        return ar;
    }
}