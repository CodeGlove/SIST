package am;

public class Ex2 {
	public static void main(String[] args) {
		//프로그램 시작
		
		// 변수 선언
		//  변수는 자료형을 알아야 한다.
		//  -자바에서는 자료형을 크게 2가지로 나눠진다.
		//	- 1) 기본자료형  2) 객체(참조)자료형
		//   boolean: true(참), false(거짓)
		boolean b1 = true; //변수 선언
		System.out.println(b1); //문장의 끝은 반드시 세미콜론(;)
		
		// char: 하나의 문자를 기억하는 자료형 문자는 홑따옴표로 구분함
		char b2 = 'A';
		System.out.println(b2);//A
		b2 = 'B'; //변수 사용(값 변경)
		System.out.println(b2);//B
		
		// 정수형 변수 선언 : byte, short, int, long
		byte b3 = 127; // 범위: -128~127까지
		
		short b4 = 32767;
		int b5 = 2100000000;
		System.out.println(b4+b5);//32767 + 2100000000 더한 후 출력
		
		long b6 = 10L; //long형의 값을 의미할 때는
								// 값 뒤에 l 또는 L을 기술한다.
		System.out.println(b6);
	}
}
