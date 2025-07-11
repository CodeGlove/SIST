package mybatis.dao;

import mybatis.service.FactoryService;
import mybatis.vo.MemoVO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MemoDAO {

    public static List<MemoVO> getALL(){
        SqlSession ss = FactoryService.getFactory().openSession();
        List<MemoVO> list = ss.selectList("memo.all");
        ss.close();
        return list;
    }

    public static int addMemo(String writer, String content){

            MemoVO vo = new MemoVO();

            vo.setWriter(writer);
            vo.setContent(content);



            SqlSession ss = FactoryService.getFactory().openSession();
            int cnt = ss.insert("memo.add", vo);

            if(cnt > 0)
                ss.commit();
            else
                ss.rollback();
            ss.close();
            return cnt;
    }
}
