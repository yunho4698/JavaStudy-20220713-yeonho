package j11_상속2;
//A 를 상속 받음
public class ClassC extends ClassA{
	public ClassC() {
		System.out.println("두번째(C) 자식 클래스 생성자 호출");
		System.out.println();
	}
	
	@Override
	public void printInfo() {
		System.out.println("두번째(C) 자식 ");
		
		super.printInfo();
	}
	
	@Override
	public void showData() {
		System.out.println("활을 만들어서 쏠 준비를 한다.");   //이것도 A에서 받은 설계도를 이용하여 활을 만들어서 쏠 준비를 함.
	}
	
	public void removeData() {
		System.out.println("데이터를 삭제합니다.");   //C에만 있는 메서드
	}
	
	
	
}
