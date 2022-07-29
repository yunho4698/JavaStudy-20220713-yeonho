package j09_클래스3;

public class Teacher extends Person{
	private String subject;
	private int teacherCode;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	//전체 생성자, 부모것도 같이
	public Teacher(String name, int age, String subject, int teacherCode) {
		super(name, age);
		this.subject = subject;
		this.teacherCode = teacherCode;
	}





//
//	public Teacher(String subject, int teacherCode) {    //외부에서 접근할 수 있도록 해주는 생성자
//		super();
//		this.subject = subject;
//		this.teacherCode = teacherCode;
//	}
//	
	
	public String getSubject() {  //은행원이 대신 돈을 전달해주는 넣어주는 역할
		return subject;
	}
	public void setSubject(String subject) {   //은행원이 대신 돈을 받아서 넣어주는 역할
		this.subject = subject;
	}
	public int getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}
	
	
}
