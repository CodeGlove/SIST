package pm;

public class Ex10_Multi_For {

	public static void main(String[] args) {
		// 1 2 3 4
		// 5 6 7 8
		int num = 0;
		for(int k=1; k<=2; k++) {
			for(int i=1; i<=4; i++) {
				System.out.printf("%2d", ++num);
			}//inner for
			System.out.println();//줄바꿈
		}//outer for 
		
		System.out.println("---------------------------------");
		
		/*
		 [결과1]
		 * * * *
		 * * * *
		 * * * *
		 * * * * 
		 
		 */
		for(int k=1; k<=4; k++) {
			for(int i=1; i<=4; i++) {
				System.out.printf("%2c", '*');
			}
			System.out.println();//줄바꿈
		}
		System.out.println("---------------------------");
		/*
		 [결과2]
		 0 * * *
		 * 0 * *
		 * * 0 *
		 * * * 0 		 
		 */
		for(int k=1; k<=4; k++) {
			for(int i=1; i<=4; i++) {
				if(k==i)
					System.out.printf("%2c", '0');
				else
					System.out.printf("%2c", '*');
			}
			System.out.println();//줄바꿈
		}
	}

}
