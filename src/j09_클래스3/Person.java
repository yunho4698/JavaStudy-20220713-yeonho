package j09_클래스3;

public abstract class Person {
	private String name;
	private int age;
	
	
	//4
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	//3
	public Person(String name, int age) {
		super();
		this.name = name; //this -> 자기자신의 주소 == person.name 이랑 같음
		this.age = age;
	}
	
	public void test() {
		String name = "김준일";   // 메소드 안에서 쓰는 name
		System.out.println(this.name);  //지역변수로 쓰는 네임 그래서 this 를 써줌
		//지역변수와 멤버변수 구분해줘야함
		//지역변수의 우선순위가 높음
		
	}
	
	public void setName(String name) {  //set은 외부로 부터 값을 받아서 전달, String name 이 외부로 받은 ㅏㄱㅄ
		this.name = name;
		
	}
	
	public String getName() {  //반환 자료형
		return name;        //안에서 다른 name이 없어서 this를 안씀
	}

	public abstract String mealTime();  //(1)
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	

	
	 
	
	
	
}
