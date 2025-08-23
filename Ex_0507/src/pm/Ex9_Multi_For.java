package pm;

public class Ex9_Multi_For {

	public static void main(String[] args) {
		// 화면에 1~5까지 출력하는 반복문
		/*
		 [결과]
		 1 2 3 4 5
		 1 2 3 4 5
		 1 2 3 4 5
		 */
		
		for(int i=1; i<=5; i++) {
			//System.out.print(i+" ");
			System.out.printf("%-2d", i);
		}//for의 끝
		System.out.println();//줄바꿈
		
		for(int i=1; i<=5; i++) {
			//System.out.print(i+" ");
			System.out.printf("%-2d", i);
		}//for의 끝
		System.out.println();//줄바꿈
		
		for(int i=1; i<=5; i++) {
			//System.out.print(i+" ");
			System.out.printf("%-2d", i);
		}//for의 끝
		System.out.println();
		System.out.println("------------ 다중for문 --------------");
		
		for(int k=1; k<=3; k++) {
			
			for(int i=1; i<=5; i++) {
				//System.out.print(i+" ");
				System.out.printf("%-2d", i);
			}//for의 끝
			System.out.println();//줄바꿈
		}//바깥쪽for의 끝
	}

}



