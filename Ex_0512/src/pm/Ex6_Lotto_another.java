package pm;

import java.util.Arrays;

public class Ex6_Lotto_another {

	public static void main(String[] args) {
		// 프로그램의 시작
		
		int[] ar = new int[6]; // 6칸의 배열을 지정한다.
		
		for(int i=0; i<ar.length; ) { // 하단의 i--를 쓰지 않을 경우, i값을 증가시키지 않는다.
			ar[i]=(int)(Math.random()*45+1); // 난수 발생 // 생성된 난수를 배열 변수ar[i]에 순차적으로 집어 넣는다.
			boolean chk=false; // boolean형을 먼저 선언하여 변수 chk가 false임을 선언한다.
			for(int k=0; k<i; k++) { // 비교를 위한 for문이다.
				if(ar[i] == ar[k]) { // 순차적으로 i가 kr값이 같은지를 비교한다. 예를 들어 이 때 i가 0번지일 때와 k가 0번지 일 때는 수행하지
									 // 않는다. i가 1번지 일 때는 0번지를 비교한다. 2번지일 때는 0번지와 1번지를 비교하는 순으로 진행된다.
					// i--
					chk=true; // i와 k가 같으면 chk는 true라는 선언을 해주어 true이지만 false라는 의미.
					break; // break;로 반복문을 빠져나오게 한다.
				} // if문의 끝
			} // for문의 끝
			if(!chk) // !chk여서 !는 부정을 의미, chk가 true가 아닐 경우, 그 값이 true일 경우, 
				i++; // break문으로 반복 for문을 빠져나온 것이기 때문에 i값을 증가시키도록 선언한다. 
		}
		Arrays.sort(ar); // 오름차순 정렬
		
			for(int i=0; i<ar.length; i++) {
				System.out.printf("%-3d", ar[i]); // for문을 빠져나오고 나서 반복문을 선언한다.
			}

	}

}
