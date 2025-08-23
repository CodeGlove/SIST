package am;

public class Ex6_For {

	public static void main(String[] args) {
		// 1~20까지 반복처리하는 반복문을 구현하자!
		// 단, 3의배수만 출력해야 한다.
		
		for(int i=1 ; i<=20; i++) { //20번 반복수행
			
			//i가 3의 배수일 때만 출력하면 된다. 그럼 비교문 사용해야 함!
			if(i%3 == 0)
				System.out.println(i+"**");
			else
				System.out.println(i);
		}
		
		System.out.println("--------------------");
		for(int i=3 ; i<=20; i+=3) { //6번 반복수행
			System.out.println(i);
		}

	}

}
