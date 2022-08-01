package j13_최상위클래스;

public class ToString {
	
	private int a;
	private int b;
	
	
	public ToString(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public String toString() {
		return "ToString [a=" + a + ", b=" + b + "]";
	}

	
	

//	@Override
//	public String toString() {
//		return "a: " + a + ", b: " + b;
//	}
//	
//	//1. pubic void showInfo 이렇게 해서 ab값을 보여줬던것을 object를 이용하여 생략
	
	
}
