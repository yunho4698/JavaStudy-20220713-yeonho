package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		StaticTest.name = "김준일";
		StaticTest.printTest();  //생성하지 않아도 스태틱 클래스에 있어서 출력이라고 나옴
		//생성과 메소드의 차이-> 이태릭체로 기울여짐
		
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "김준일";
		
		System.out.println(staticTest.name);
		staticTest.printTest();
		
//		StaticTest staticTest2 = new StaticTest();
//		staticTest2.name = "김준이";
//		System.out.println(staticTest2.name);
//		
//		
//		System.out.println(staticTest.name);
		
		
		
		
		

	}

}
