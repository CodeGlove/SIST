package am.client;

import am.vo.EmpVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {

    public static void main(String[] args) {

        try {
            // 1 ) conf.xml.과 연결되는 스트림
            Reader r = Resources.getResourceAsReader(
                    "am/config/conf.xml"
            );

            // 2 ) SqlSessionFactory 생성
            SqlSessionFactory factory =
                    new SqlSessionFactoryBuilder().build(r);

            // 3 ) 사용된 스트림 닫기
            r.close();

            // ---------- 3번까지는 한 번만 수행함



            // SQL 문장을 호출하기 위해 SqlSession을 factory로부터 얻어낸다
            SqlSession ss = factory.openSession();
            //List<EmpVO> list = ss.selectList("emp.searchDept", 10);

            Map<String, Integer> map = new HashMap<>();
            // map.put("no", null); // no라는 키 (변수) 가 있어도 그 값이 null 이라면 MyBatis는 이것을 없다고 간주한다
            map.put("no", 10);
            map.put("sal", 3000);
            //List<EmpVO> list = ss.selectList("emp.searchDept2", map);
            List<EmpVO> list = ss.selectList("emp.searchDept3", map);

            System.out.println(list.size());

            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
