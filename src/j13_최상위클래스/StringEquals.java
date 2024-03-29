package j13_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "김준일";    //100번 주소의 김준일
		String name2 = "김준일";    //100번 주소의 김준일
		String name3 = new String("김준일");   //새로운 주소 200번 안에 100번
		String name4 = name3; //200번
		
		System.out.println("name1: " + name1);
		System.out.println("name2: " + name2);
		System.out.println("name3: " + name3);
		System.out.println("name4: " + name4);
		System.out.println();
		
		
		//주소값 비교
		System.out.println("name1 == name2: " + (name1 == name2)); //t
		System.out.println("name1 == name3: " + (name1 == name3)); //f
		System.out.println("name3 == name4: " + (name3 == name4)); //t
		
		System.out.println();
		//밑에는 값 비교
		System.out.println("name1.equals(name2): " +name1.equals(name2));
		System.out.println("name1.equals(name3): " +name1.equals(name3));
		System.out.println("name3.equals(name4): " +name3.equals(name4));

		
		
	}

}
