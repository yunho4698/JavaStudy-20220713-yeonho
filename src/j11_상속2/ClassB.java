package j11_상속2;
//A를 상속 받음
public class ClassB extends ClassA{

	public ClassB() {
		super();  //이게 생략이 되서 Main 에서 A꺼 먼저 나오고 B 꺼 나옴
		System.out.println("첫번째(B) 자식 클래스 생성자 호출");
		System.out.println();
		super.printInfo();
	} 
	
	@Override
	public void printInfo() {
		System.out.println("첫번째(B) 자식 ");
		super.printInfo();
	}
	
	@Override
	public void showData() {
		System.out.println("총을 만들어서 쏠 준비를 한다.");   //A에서 받은 설계도를 이용하여 총을 만들어서 쏠 준비
	}
	
	
	public void addData() {
		System.out.println("데이터를 추가합니다.");  //B에만 있는 메소드
	}
}
