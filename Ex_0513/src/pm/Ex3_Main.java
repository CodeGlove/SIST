package pm;

import java.util.Scanner;

public class Ex3_Main {

	public static void main(String[] args) {
		// 원하는 구구단을 출력하는 기능을 가진 객체를 생성하자!
		Ex3_Gugudan gu = new Ex3_Gugudan();
		
		System.out.println("단:");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt(); // 키보드로 부터 정수 하나를 받는다.
		
		gu.setDan(dan);// 키보드로부터 받은 값을 구구단객체에 멤버변수에 저장한다.

		//해당 단을 출력하는 기능을 호출하자!
		gu.print();
	}

}
