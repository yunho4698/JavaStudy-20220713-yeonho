package j09_클래스3;

public class PersonMain2 {

	public static void main(String[] args) {

		//생성되는 시점에 값을 넣어서 생성하는거
		Student student1 = new Student("김준일", 29, "부산초등학교", 20220001, 1);  

		System.out.println(student1.toString());
	}

}
