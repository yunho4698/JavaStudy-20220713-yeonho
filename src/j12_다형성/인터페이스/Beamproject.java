package j12_다형성.인터페이스;

public class Beamproject implements VGA{ //인터페이스를 클래스에서 사용할때는 implements를 사용
	
	@Override
	public void connect() {
		System.out.println("VGA 케이블을 통해 빔프로젝트를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("VGA 케이블에 연결된 빔프로젝트 연결을 해제합니다.");
	}
	
}
