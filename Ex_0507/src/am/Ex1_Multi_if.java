package am;

public class Ex1_Multi_if {

	public static void main(String[] args) {
		// 1~10까지의 수들 중 난수 발생
		// Math.random()*범위+시작수
		int ran = (int)(Math.random()*10+1);
		
		// ran의 값이 홀수인지? 짝수인지? 판단하자!
		// 짝수란? 2로 나눴을 때 나머지가 0인 값!
		if(ran%2 == 0)
			System.out.println(ran+"은 짝수");
		else
			System.out.println(ran+"은 홀수");
	}

}
