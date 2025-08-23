package am;

public class Ex3_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		
		int a = 10;
		int b = 7;
		
		boolean res = (10 >= a++) || (++b > 7);
		
		// 각 변수들 a, b, res의 값을 예측하자면...
		// a++는 증감연산자가 변수 뒤에 존재하므로 연산이
		// 줄바꿈할 때 수행한다. 그래서
		// 먼저 10 >= 10을 수행하여 res에 결과 true가 저장한다.
		// 그리고
		// 논리연산자 ||로 인해 두번째 조건을 수행하지 않는다.
		// 즉 (++b > 7) 이 연산을 하지 않고 다음 행으로 전환된다.
		
		System.out.print("");

	}

}
