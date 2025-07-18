package mybatis.dao;

import mybatis.service.FactoryService;
import mybatis.vo.DeptVO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DeptDAO {

    public static DeptVO[] getAll(){
        SqlSession ss = FactoryService.getFactory().openSession();
        DeptVO[] ar = null;
        List<DeptVO> list = ss.selectList("dept.all");
        if (list != null && !list.isEmpty()){
            ar = new DeptVO[list.size()];
            list.toArray(ar);
        }
        ss.close();
        return ar;
    }

    public static int add(DeptVO vo){
        int cnt = 0;
        SqlSession ss = FactoryService.getFactory().openSession();
        cnt = ss.insert("dept.add",vo);
        if(cnt >0)
            ss.commit();
        else
            ss.rollback();
        ss.close();

        return cnt;
    }
}
