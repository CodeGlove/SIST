package am;

public class Ex5_For {

	public static void main(String[] args) {
		// 1~10까지 반복하여 출력하는 for문!
		
		/*
		  [for의 구성]
		  for(초기식; 조건식; 증감식){
		  	조건식에 만족할 때 수행하는 문장;
		  }
		 */
		for(int su=1; su<=10; su++) {
			System.out.println(su);
		}//for의 끝
		
		System.out.println("---------------------");
		
		for(double i=1; i<=10; i+=0.5) {
			System.out.println(i);
		}// 이렇게 할거면 int형으로 20보다 작거나 같을 때까지 돌리는 것이
		// 가독성에서는 더 유익하다
		
		System.out.println("---------------------");
		
		for(int i=0; i<10; i+=2) {
		//	System.out.println(i);// 0~9까지 표현됨
			System.out.println(i+1);// 1~10까지 표현됨
		}
		
		System.out.println("-------- 무한반복 ----------");
		
		for(;;) {
			System.out.println("^^");
		}
		
	}

}
