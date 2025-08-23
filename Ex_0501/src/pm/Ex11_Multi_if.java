package pm;

import java.util.Scanner;

public class Ex11_Multi_if {

	public static void main(String[] args) {
		// 프로그램 시작
		
		System.out.println("값 :");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		// 변수 value의 값이 1, 아니면 2, 아니면 3이 들어간다고 가정하자!
		// 1일때, "초보" 출력하고
		// 2일때, "중급" 출력하고
		// 3일때, "고급" 출력하자
		// 그 외는 모두 "잘 못 입력"이라고 출력하자!
		//위를 해결하기 위해서는 다중if문을 구현해야 한다.
		//[구성]
		/*
			if(조건식1)
				조건식1을 만족하는 수행문;
			else if(조건식2)
				조건식1에는 맞지않지만 조건식2에는 만족하는 수행문;
			else if(조건식3)
				조건식1,2에는 맞지않지만 조건식3에는 만족하는 수행문;
			else
				조건식1,2,3 모두 맞지않는 수행문;
		
		if(value == 1)
			System.out.println("초보");
		else if(value == 2)
			System.out.println("중급");
		else if(value == 3)
			System.out.println("고급");
		else
			System.out.println("잘 못 입력");
		*/
		String str = "";
		if(value == 1)
			str = "초급";
		else if(value == 2)
			str = "중급";
		else if(value == 3)
			str = "고급";
		else
			str = "잘 못 입력";
		
		System.out.println(str);

	}

}
