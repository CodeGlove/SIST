package am;

public class Ex4_Break {

	public static void main(String[] args) {
		// 문자열(String)을 기억하는 str이라는 변수 선언
		String str = "100239384";
		
		// str이 기억하는 문자열의 길이만큼 반복문을 수행하자!
		int i=0;
		while(i<9) {
			//str에서 문자를 하나 얻어낸다.
			char ch = str.charAt(i);
			
			//얻어낸 값이 '5'이상이면 탈출하자!
			if(ch >= '5')
				break;
			
			++i;
			System.out.printf("%-2c", ch);
		}//while의 끝

	}

}
