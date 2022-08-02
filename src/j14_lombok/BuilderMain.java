package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		
		Builder builder = new Builder();
		Car car = builder.builder()
			.company("기아")
			.model("k5")
			.color("화이트")
			.build();    //여기서 빌드를 해야 객체를 넣어주는거임
		// 주소.주소.주소. 이런방식이니깐 우리는 주소를 리턴하게 만들어줘야함
		// int. 이 안되는 것이니깐 우리는 주소를 리턴해야함.
		// 주소
			
		System.out.println(car);
		
		
		Car car2 = new Car();
		car2.setCompany("현대");
		car2.setColor("블랙");
		
		
	}

}
