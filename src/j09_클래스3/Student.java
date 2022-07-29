package j09_클래스3;

public class Student extends Person { //Person으로부터 상속받음
	private String schoolName;
	private int studentCode;
	private int studentYear;
	
	public Student() {
		
	}

	//부모생성자가 받아야 될거까지 같이 들어옴, 전체생성자임, constructor using Fields 에서 맨위에 2번째꺼 선택
	public Student(String name, int age, String schoolName, int studentCode, int studentYear) {
		super(name, age);
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYear = studentYear;
	}
	
	

	
	
//	
//	public Student(String schoolName, int studentCode, int studentYear) {
//		super();
//		this.schoolName = schoolName;
//		this.studentCode = studentCode;
//		this.studentYear = studentYear;
//	}
	
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", studentCode=" + studentCode + ", studentYear=" + studentYear
				+ "]";
	}

	@Override
	public String mealTime() {

		
		return "점심시간 10분전"; //Person(1)에서 추상 클래스를 만들어서 오버라이드를 추가해줌
	}


	
	
	
}
