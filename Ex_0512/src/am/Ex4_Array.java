package am;

public class Ex4_Array {

	public static void main(String[] args) {
		/*
		 	0 0 0 0		1 0 0 0     ->  ar[0][0]
		 	0 0 0 0 ==> 0 1 0 0     ->  ar[1][1]
		 	0 0 0 0		0 0 1 0     ->  ar[2][2]
		 	0 0 0 0 	0 0 0 1     ->  ar[3][3]
		*/
		int[][] ar = new int[4][4];
		/*
		 * ar[0][0] = 1; 1263854
		 * ar[1][1] = 1; 
		 * ar[2][2] = 1; 
		 * ar[3][3] = 1;
		 */
		System.out.println("----- 초기내용 ------");  
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				// 각 1차원배열을 접근하는 반복문
				System.out.printf("%-2d", ar[i][j]);
			}
			//1차원 배열이 하나씩 끝날 때마다 줄바꿈
			System.out.println();
		}
		
		System.out.println("----- 1값 초기내용 ------");
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				if(i == j)
					ar[i][j] = 1;
				System.out.printf("%-2d", ar[i][j]);
			}
			//1차원 배열이 하나씩 끝날 때마다 줄바꿈
			System.out.println();
		}
	}

}
