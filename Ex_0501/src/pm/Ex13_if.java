package pm;

import java.util.Scanner;

public class Ex13_if {

	public static void main(String[] args) {
		// 키보드로 부터 점수를 하나 받아 score에 저장한다.(0~100)
		// 그 점수가 80~100 이면 "우수",
		// 60~79 이면 "보통", 
		// 40~59 이면 "좀 걱정",
		// 그 이하는 "나오지 마!"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수:");
		int score = scan.nextInt(); //키보드로 부터 점수 받기
		
		// 유효하지 않는 값들 걸러내기
		if(score > 100 || score < 0) {
			System.out.println("잘 못된 값");
			return;// 그만(더 이상 수행하지 않는다.) 
		}
		
		//제어가 여기에 왔을 때는 score의 최대 값은 100이다.
		
		if(score >= 80) // 80~100사이 
			System.out.println("우수");
		else if(score >= 60) // 80~100사이 
			System.out.println("보통");
		else if(score >= 40)
			System.out.println("좀 걱정");
		else
			System.out.println("나오지 마!");
		
	}

}
