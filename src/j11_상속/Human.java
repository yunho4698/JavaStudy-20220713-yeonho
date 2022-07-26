package j11_상속;

public class Human extends Animal{
	
	public Human() {
		super(); //이게 생략되어 있는 거임. 부모의 주소임.
		System.out.println("Human 객체 생성");
		//super() 이렇게 밑에 오는 경우는 안됨. 부모가 먼저 생성 그 이후에 자식 객체 생성
	}
	
	@Override //오버라이드: 재정의, @ -> 어노테이션
	public void move() {
		super.move();
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
