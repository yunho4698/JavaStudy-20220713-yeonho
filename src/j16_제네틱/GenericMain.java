package j16_제네틱;

import j14_lombok.Car;

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>();  //generic 에서는 int(일반자료형) 를 쓸 수 없고 Integer 로 써야함.
		GenericTest<String, Car> genericTest2 = new GenericTest<String, Car>();
		
		genericTest.setKey(100);
		genericTest.setValue("원");
		
		System.out.println(genericTest.getKey() + genericTest.getValue());
	}

}
