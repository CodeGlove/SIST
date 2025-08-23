package pm;

public class Ex12_Test {

	public static void main(String[] args) {
		// [문제1] 다음의 결과와 같은 모양을 출력하는 반복문을 구현하시오
		//  [결과]
		/*
		 	 * * * *
		 	 * * *
		 	 * *
		 	 * 	
		 */
		for(int k=0; k<4; k++) {
			for(int i=4; i>k; i--) {
				System.out.printf("%2c",'*');
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
		System.out.println("---------------------------");
		// [문제2] 다음의 결과와 같은 모양을 출력하는 반복문을 구현하시오
		//  [결과]
		/*
		 	 * * * *
		 	   * * *
		 	   	 * *
		 	   	   * 	
		 */
		for(int k=1; k<5; k++) {
			for(int i=1; i<5; i++) {
				if(i>=k)
					System.out.printf("%2c",'*');
				else
					System.out.printf("%2c",' ');
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
		// [문제3] 구구단을 다음과 같이 출력하는 반복문을 구현하시오
		//  [결과]
		/*
		 	 2*1=2   3*1=3  ...  9*1=9
		 	 2*2=4   3*2=6  ...  9*2=18
		 	 ...     ...    	 ...
		 	 2*9=18  3*9=27 ...  9*9=81
		 */
		
		System.out.println("-------- 구구단 ------------");
		
		for(int k=1; k<10; k++) {
			for(int i=2; i<10; i++) {
				System.out.printf("%d*%d=%-4d",i,k,(i*k));
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
	}

}





