package j12_다형성.인터페이스;

/*
 * 인터페이스 특징(상속이라고 하지 않고 구현이라고 한다.)
 * 1. 모든 메소드는 기본적으로 추상 메소드로 정의한다.
 * 2. 생성을 할 수 없다.
 * 3. 일반 변수는 선언할 수 없다.
 * 4. 무조건 스태틱 상수를 사용한다.
 * 5. 일반 메소드를 정의하기 위해서는 반환 자료형 앞에 default를 입력해야 한다.
 * 6. 인터페이스는 다중 구현이 가능하다.
 * 
 * 클래스-클래스 ->상속, 인터-인터 ->상속, 클래스-인터 ->구현
 * 서로가 쌍방향의 관계를 가지면 상속, 한방향은 구현
 * 복습방법 : 메인부터 시작(주석 달기 ex_스캐너 객체 필요해서 생성, 메뉴 뭐 선택햇는지 저장하기 위해서)
 * 
 */

public interface HDMI extends ConnectionTerminal{ //인터페이스와 인터페이스는 상속
	public String VERSION = "2.0";
	
	public void soundOutput();
	
}
