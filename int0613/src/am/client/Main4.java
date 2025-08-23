package am.client;

import am.vo.EmpVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main4 {

    public static void main(String[] args) throws IOException {

        Reader r = Resources.getResourceAsReader(
                "am/config/conf.xml"
        );

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);

        r.close();

        SqlSession ss = factory.openSession();

        Map<String, String> map = new HashMap<>();
        map.put("no", "10");
        map.put("job", "CLERK");

        List<EmpVO> list = ss.selectList("emp.search", map);

        System.out.println(list.size());

        ss.close();

    }

}
