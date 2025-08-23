package am;

public class Ex2_Oper {

	public static void main(String[] args) {
		// 프로그램 시작
		// 증감연산자 : ++, --
		
		// 정수 8을 기억하는 변수 a를 만들자!
		int a = 8;
		
		int b = ++a + 3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		b = a++ + 3; // ++연산자가 변수 뒤에 있으면 우선순위가 
		// 가장 낮아서 제어가 다음행으로 이동될 때 1증가하게 된다.
		
		System.out.println("a="+a); // 10
		System.out.println("b="+b); // 12
		
		System.out.println(a++);//10
		// 개행이 될 때 a의 값을 1증가 시켜서 11이 된다. 그래서
		// 출력될 당시에는 10이 출력되는 것이 맞다
		System.out.println(a);// 11
	}

}
