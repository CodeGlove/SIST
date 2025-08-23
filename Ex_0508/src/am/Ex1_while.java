package am;

public class Ex1_while {

	public static void main(String[] args) {
		// while문의 구성
		/*
		 	while(조건식){
		 		조건식에 만족시 수행하는 문장1;
		 		조건식에 만족시 수행하는 문장2;
		 	}
		  	
		  	1~10까지 반복하는 while문 작성!
		 */
		int i=0;// 변수 초기화
		while(i<10) {
			++i;
			System.out.printf("%-2d",i);
			
		}//while의 끝
		//while문을 사용할 때 조심해야할 것은
		//조건식을 언젠가는 불만족시킬 수 있도록 증감 또는
		//다른 식으로 구현해야 한다.
	}

}
