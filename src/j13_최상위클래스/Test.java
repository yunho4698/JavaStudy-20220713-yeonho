package j13_최상위클래스;

public class Test extends Object{ 
	//모든 클래스는 Object를 상속받음. 근데 늘 생략하기에 안보일뿐, 그래서 밑에애들이 오버라이드 가능
	//클래스는 다중상속이 안되지만 Object는 상속이 가능
	//모든 객체는 Object로 업캐스팅가능

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void testMethod() {
		System.out.println("테스트 메소드");
	}
	

}
