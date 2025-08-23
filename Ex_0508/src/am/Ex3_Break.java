package am;

public class Ex3_Break {

	public static void main(String[] args) {
		// [결과]
		/*
		 	1 2 3 4
		 	1 2 3 4
		 	
		 */
		int k=0;
		while(k<4) {
			int i=0;
			while(i<4) {
				System.out.printf("%-2d",++i);
				//i가 3의 배수일 때 탈출!
				if(i%3 == 0)
					break;// 가장 가까운 반복문 탈출
			}
			System.out.println();//줄바꿈
			++k;
		}
		
	}

}
