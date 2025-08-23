package pm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex6_BufferedInput {

	public static void main(String[] args) {
		String path = "c:/my_study/java_study/work/Ex0528/src/pm/Ex5_FileInput.java";
		
		//FileInputStream을 활용하여 읽은 후 화면에 출력하시오!
		File f = new File(path);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			int size = -1;
			byte[] buf = new byte[2048];//*********
			
			while((size = bis.read(buf)) != -1) {
				String str = new String(buf, 0, size);
				//위는 배열 buf의 0번지 부터 size가 기억하고 있는 번지까지
				// 가져와서 문자열로 만든다.(0~1047)
				System.out.println(str);				
			}//while의 끝
			
		} catch (Exception e) {
			// 예외가 발생할 경우 오류난 상황을 Stack구조로 표현한다.
			e.printStackTrace();
		} finally {
			try {
				fis.close();//스트림 닫기
				bis.close();
			} catch (Exception e2) {
			}
		}

	}

}
