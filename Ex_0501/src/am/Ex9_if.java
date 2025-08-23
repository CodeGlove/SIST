package am;

import java.util.Scanner;

public class Ex9_if {

	public static void main(String[] args) {
		// 키보드로 부터 점수(0~100)를 받아서
		// 60점 이상이면 "합격"을 출력하고 그렇지 않으면
		// "재도전"을 출력하세요
		System.out.println("점수:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//먼저 score의 값이 100을 넘었는지? 확인하는 비교문
		if(score <= 100) {
			//제어가 이 안에 들어오면 즉 score의 최대 값은 100이다.
			if(score >= 60 )
				System.out.println("합격");
			else
				System.out.println("재도전");
		}else {
			// score가 100을 넘은 경우
			System.out.println("잘 못 입력하셨습니다.");
		}
		
	}

}
