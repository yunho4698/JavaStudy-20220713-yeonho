package j13_최상위클래스;

public class ObjectMain {

	public static void main(String[] args) {
		Object object = new Object();
		
		Object test = new Test();
		
		((Test) test).testMethod(); //다운캐스팅해야지 testMethod 사용가능
		
		
	}

}
