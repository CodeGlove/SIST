package am;

public class Ex2_Switch {

	public static void main(String[] args) {
		// 프로그램 시작
		// switch문의 구성
		/* 
		   switch(조건값){
			 case 비교값1:
			   조건값이 비교값1과 같을 때 수행;
			   break;
			 case 비교값2:
			   조건값이 비교값2와 같을 때 수행;
			   break;
			   .....
			   .....
			 case 비교값n:
			   조건값이 비교값n과 같을 때 수행;
			   break;
			 default:
			 	조건값과 모든 비교값이 다를 때 수행;
			 	마지막에는 break문 생략가능
		   }
		   
		   문제) 1~3까지의 수들 중 난수를 발생시켜 su라는 변수에 저장하자
		   난수가 1일 경우엔 "초급"출력
		   2일 경우엔 "중급"출력
		   3일 때는 "고급"을 출력하자! (단! switch문 활용)
		*/
		int su = (int)(Math.random()*3+1);
		switch(su) {
			case 1:
				System.out.println("초급");
				break;// 탈출
			case 3:
				System.out.println("고급");
				break;
			case 2:
				System.out.println("중급");
				break;
			default:
				System.out.println("1~3의 값이 아닌경우!");
		}
		System.out.println("--------------- if문 사용 ------------------");
		if(su == 1)
			System.out.println("초급");
		else if(su == 2)
			System.out.println("중급");
		else if(su == 3)
			System.out.println("고급");
		else
			System.out.println("잘 못된 값");
	}

}




