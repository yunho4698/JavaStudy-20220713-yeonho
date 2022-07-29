package j11_상속2;
//부모클래스
public abstract class ClassA {  //B,C 를 묶어주기 위해서만 쓰지 따로 생성하지 않기 위해서 abstract 사용 , B,C 에서 new class A 가 실행되지 않는 이유
	
	public ClassA() {
		System.out.println("부모 클래스 생성자 호출");
	}
	
	public void printInfo() {
		System.out.println("부모의 정보를 출력");
		System.out.println();
	}
	
	public abstract void showData(); //총 설계도 만 준거임
	 
}
