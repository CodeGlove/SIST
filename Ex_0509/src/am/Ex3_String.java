package am;

public class Ex3_String {

	public static void main(String[] args) {
		String str = "안녕하세요! 금요일이군요.";
		
		int size = str.length();
		
		//str이 기억하고 있는 문자열에서 "하"가 있는 위치
		// index값(정수)을 알아내자!
		int idx = str.indexOf("하");
		System.out.println("str.indexOf(\"하\"):"+idx);
		
		// "요"의 위치를 찾아보자!
		int idx2 = str.indexOf("요"); //왼쪽기준으로 가장 가까운 "요" 
		System.out.println("str.indexOf(\"요\"):"+idx2);
		
		// 찾은 "요" 이후에 있는 "요"를 검색하자!
		int idx3 = str.indexOf("요", idx2+1);
		System.out.println("str.indexOf(\"요\", idx2+1):"+idx3);
		
		//int idx4 = str.indexOf("요", idx3+1);
		int idx4 = str.lastIndexOf("요");// 검색을 뒤에서 시작한다.
		//하지만 index값이 바뀌는 것은 아니다.
		System.out.println("str.lastIndexOf(\"요\"):"+idx4);
		System.out.println("---------------------------------------");
		
		String file_name = "  Ex1.java  ";//외부에서 인자로 받았다고 가정하고
		// 내용은 모른다고 생각하자
		// 받은 파일이 자바파일 또는 텍스트파일인지? 판단하자!
		String t_fname = file_name.trim();//공백제거된 값("Ex1.java")
		if(t_fname.endsWith(".java") || t_fname.endsWith(".txt")) {
			System.out.println("자바 또는 텍스트파일입니다.");
		}else {
			System.out.println("처리할 수 없습니다.");
		}
		
		// a를 찾아서 *로 변경하자!
		String ss = t_fname.replaceAll("a", "*");
		System.out.println(t_fname);// Ex1.java
		System.out.println(ss);// Ex1.j*v*
	}

}
