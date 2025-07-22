package bbs.dao;

import mybatis.service.FactoryService;
import mybatis.vo.BbsVO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BbsDAO {
    //총 게시물의 수를 반환
    public static int getTotalCount(String bname){
        SqlSession ss = FactoryService.getFactory().openSession();
        int cnt = ss.selectOne("bbs.totalCount", bname);
        ss.close();
        return cnt;
    }

    //목록 반환
    public static BbsVO[] getList(String bname, int begin, int end){
        BbsVO[] ar = null;
        SqlSession ss = FactoryService.getFactory().openSession();
        Map<String, Object> map = new HashMap<>();
        map.put("bname", bname);
        map.put("begin", begin);
        map.put("end", end);

        List<BbsVO> list = ss.selectList("bbs.list", map);

        if(list != null && !list.isEmpty()){
            ar= new BbsVO[list.size()];

        list.toArray(ar);
        }
        ss.close();

        return ar;
    }
    //저장

    //수정

    //삭제
}
