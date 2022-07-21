package j08_메소드;

public class Method2 {
	/*
	 * 반환자료형, 리턴자료형
	 * 반환값, 리턴값
	 * 메소드명, 함수명
	 * 파라미터, 매개변수
	 * 메소드(함수) 정의
	 * 메소드(함수) 호출(콜)
	 */
	
	
	//반환도 없고 매개변수도 없는 메소드 
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	// 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}
	
	//반환이 업속 매개변수가 두개인 메소드
	public static void test3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	//반환은 있고 매개변수가 없는 메소드
	public static int test4() {
		System.out.println("test 메소드 호출");
		return 100;
	}
	
	public static void main(String[] args) {
		test1();
		test1();
		test1();
		test2(1234);
		test3(1111, 2222);
		int a = test4();
		System.out.println(a);
		System.out.println(test4());
		
	}

}
