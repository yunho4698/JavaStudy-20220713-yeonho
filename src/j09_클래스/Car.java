package j09_클래스;

public class Car {

	Car() {
		// 생성자는 무조건 주소값을 리턴한다. String, Int 이런거 지정할 필요없음
		// 생성자는 무조건 클래스명과 동일해야한다(대문자로 시작해야함)
		System.out.println("생성자 호출?");
	}
		String company;
		String model;
		String color;
		
		void showCarInfo() {
			System.out.println("회사명 : " + company);
			System.out.println("모델명 : " + model);
			System.out.println("색상 : " + color);
			System.out.println();
		}
}
