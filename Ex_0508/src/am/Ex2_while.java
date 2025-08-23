package am;

public class Ex2_while {

	public static void main(String[] args) {
		// 1~45까지의 수들 중 난수를 발생시켜 출력하는 프로그램을
		// 구현하자! 난수의 수는 총 6개를 출력해야 하며
		// 반드시 while문을 사용해야 한다.
		
		int i=0;
		while(i<6) {
			//출력하고자 하는 난수를 생성한다.
			int su = (int)(Math.random()*45+1);
			System.out.printf("%-4d", su);
			++i;
		}//while문의 끝
		
		System.out.println("\r\n------------------------------"); 
		 
		/*
		   while문을 이용하여 다음과 같이 출력하자!
		   [결과]
		   * * * *
		   * * * *
		   * * * *
		 */
		int k=1;
		while(k<=3) {
			int j=1;
			while(j <= 4) {
				System.out.printf("%-2s", "*");
				++j;
			}
			System.out.println();//줄바꿈
			++k;
		}
	}

}
