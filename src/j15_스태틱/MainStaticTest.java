package j15_스태틱;

public class MainStaticTest {

	public void printTest() {
		System.out.println("출력");
	}
	
	public static void main(String[] args) {
		//printTest();  //스태틱 메소드가 아니라서 생성을 해야함. 위에서 스태틱 보이드 라고 스태틱을 주면 호출이 가능
		//MainStaticTest.printTest(); 위에거가 스태틱 보이드 라면 이렇게 바로 호출이 됨
		
		MainStaticTest mainStaticTest = new MainStaticTest();  //위에가 스태틱 보이드가 아니라 그냥 보이드면 이렇게 생성을 하고 호출 해야함.
		mainStaticTest.printTest();
		
	}

}
