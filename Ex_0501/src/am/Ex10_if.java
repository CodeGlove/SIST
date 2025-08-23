package am;

import java.util.Scanner;

public class Ex10_if {

	public static void main(String[] args) {
		// 키보드로 부터 점수(0~100)를 받아서
		// 60점 이상이면 "합격"을 출력하고 그렇지 않으면
		// "재도전"을 출력하세요
		System.out.println("점수:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//먼저 100을 넘은 경우를 걸러낸다.
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하셨습니다.");
			return; // 제어권 반환(호출한 곳으로 돌아간다.)
		}
		
		// score의 값이 100이하인 경우만 수행하는 곳
		if(score >= 60)
			System.out.println("합격");
		else
			System.out.println("재도전");

	}

}
