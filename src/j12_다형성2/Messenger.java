package j12_다형성2;

public interface Messenger {
	
	// 스태틱 상수를 가질 수 있다.
	// 모든 메소드는 기본적으로 추상메소드이다.
	
	public void send();  //void 앞에 default 를 붙이고 중괄호를 열면 일반메소드로 쓸 수 있음
	public void receive();
}
