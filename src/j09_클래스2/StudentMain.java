package j09_클래스2;

public class StudentMain {

	public static void main(String[] args) {
		int studentCount = 2;
		
		Student[] studentArray = new Student[studentCount];
		
		StudentService service = new StudentService(studentArray);
		
		//while 안에 있는 조건을 탐색하러 가는 과정
		while(service.showMainMenu()) {}
		System.out.println("프로그램 종료");
		

		
	}

}
