package am;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex4_Set_Lotto {

	public static void main(String[] args) {
		// set구조로 로또를 완성하시오!
		
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while(true) {
			int n = (int)(Math.random()*45+1);//난수 발생
			lotto.add(n);//set구조에 추가
			if(lotto.size() == 6)
				break;// 무한반복 탈출
		}//무한반복의 끝
		//System.out.println(lotto);
		
		//반복자 처리
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			int su = it.next();
			System.out.printf("%-3d",su);
		}

	}

}
