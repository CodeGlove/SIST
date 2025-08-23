package pm;

import java.util.Scanner;

public class Ex12_local_var {

	public static void main(String[] args) {
		// 프로그램 시작
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값:");
		int v1 = scan.nextInt();
		String str = "";
		if(v1 >= 60) {
			//if문의 영역
			//String str = "합격";// if문 영역의 지역변수
			str = "합격";
			System.out.println(str);
		}else {
			//String str = "재도전"; // else영역의 지역변수
				//이런 지역변수는 해당 지역 벗어나면 소멸된다.
			str = "재도전";
			System.out.println(str);			
		}
		System.out.println(str);
	}

}
