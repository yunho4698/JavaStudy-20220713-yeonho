package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20220001, "김준일");
		Student s2 = new Student(20220001, "김준일");
		Student s3 = new Student(20220002, "김준이");
		Student s4 = new Student(20220002, "김준일");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		
		System.out.println(s1.getClass() == s2.getClass());  //어떤 패키지안에 있는 클래스인지
		System.out.println(s1 instanceof Student); //밑에거와 같은거임, 사용안할거임
		System.out.println(s1.getClass() == Student.class); //이걸 사용할 거임
		System.out.println(s2.getClass());
		System.out.println(s3.getClass());
		
		
	}

}
