package j09_클래스.접근지정자.a;

public class TestA_2 {
	int ta2;
	
	public TestA_2() {
		
	}
	public void testA2() {
		System.out.println("Test!-2 메소드 호출");
		System.out.println();
		
		TestA testA = new TestA();
		testA.ta1 = "테스트 A-2에서 값 주입";
		testA.testA1();
		//A에서 private 쓰면 같은 패키지라도 클래스가 다르면 안됨
		System.out.println(testA.ta1);
	}
}
