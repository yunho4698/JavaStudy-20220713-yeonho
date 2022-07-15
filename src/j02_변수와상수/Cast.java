package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가'; 
		//연산자 양쪽은 띄어쓰기 해줘서 가독성 높여주기
		//협업을 할때 다른사람도 보는거 신경써주기
		int b = a;
		double c = b;
		//문자-정수-실수, 업캐스팅할때는 명시안해도 됨
		//다운캐스팅 할때는 명시해야함.
		//char -> double 로 넣는거는 안됨
		
		
		System.out.println(b);
		System.out.println(c);
		
		int d = (int) c; //형변환 양쪽은 띄어쓰기 해줘서 가독성 높여주기(why JDK 로 쓰면 이렇게 해야 보기 편함)
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);
	}

}
