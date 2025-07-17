package mybatis.dao;

import mybatis.vo.EmpVO;
import mybatis.vo.MemoVO;
import org.apache.ibatis.session.SqlSession;
import mybatis.service.FactoryService;

import java.util.List;

public class MemoDAO {
    public static MemoVO[] getAll(){
        MemoVO[] ar = null;
        SqlSession ss = FactoryService.getFactory().openSession();
        List<MemoVO> list = ss.selectList("memo.all");
        if(list != null && !list.isEmpty()){
            ar = new MemoVO[list.size()];
            list.toArray(ar);
        }
        ss.close();
        return ar;
    }
}
