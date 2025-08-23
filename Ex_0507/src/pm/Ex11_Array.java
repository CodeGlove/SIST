package pm;

public class Ex11_Array {

	public static void main(String[] args) {
		// 1차원배열
		// 배열은 : 같은 자료형 여러 개를 하나로 묶은 것
		// 정수 6개를 저장할 수 있는 배열준비
		int su1 = 0;
		int su2 = 0;
		int su3 = 0;
		int su4 = 0;
		int su5 = 0;
		int su6 = 0;
		//위는 변수들을 한번에 여러 개를 만들 것이지 
		// 모아둔 것은 아니다.
		int[] ar = new int[6];
		for(int i=0; i<6; i++) {
			ar[i] = (int)(Math.random()*45+1);//1~45 중 난수 발생
		}//for의 끝
		System.out.println("----------- 배열 출력 --------------");

		for(int i=0; i<6; i++) {
			System.out.printf("%-3d", ar[i]);
		}
	}

}
