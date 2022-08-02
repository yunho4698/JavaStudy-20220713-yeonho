package j15_스태틱;

public class StaticTest {
	
	public static String name;
	private int age;
	
	public static void printTest() {
		System.out.println("출력");
		System.out.println(name);
		
		//System.out.println(age);  
		//System.out.println(this.age);    //클래스란 틀은 생성이 되지 않음. this 라는 것은 존재 안함
		
		//스태틱 변수에서 쓸 수 있는 변수는 스태틱 변수다. 스태틱끼리만 쓸 수 있음.
		//스태틱을 안쓰면 생성하고 겟해서 들고와야 함
		//생성은 ~~~ new 이거 말하는 거임.
	}

}
