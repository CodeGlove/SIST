package am.client;

import am.vo.EmpVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

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

            Map<String, String> map = new HashMap<>();
            map.put("num", "3333");
            map.put("name", "손오공");
            map.put("job", "DEVELOP");
            map.put("hdate", "2025-03-08");

            // SQL 문장을 호출하기 위해 SqlSession을 factory로부터 얻어낸다
            SqlSession ss = factory.openSession();
            int cnt = ss.insert("emp.add2", map); // 1이 나오는데 이는 저장된 레코드의 수이다
            if (cnt > 0){
                ss.commit(); // 작업된 내용을 DB에 적용
                System.out.println("저장 완료");
            } else {
                ss.rollback(); // 작업 취소
                System.out.println("저장 실패");
            }

            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
