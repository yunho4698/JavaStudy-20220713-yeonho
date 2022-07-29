package j09_클래스3;

public class PersonMain {

	public static void main(String[] args) {
		//1
		String[] names = { "김준일", "서재효", "전나경" };
		int[] ages = {29, 25, 23};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i + 1+ "번 사람(이름): " + names[i]);
			System.out.println(i + 1+ "번 사람(나이): " + ages[i]);
		}
		
//		Person person1 = new Person(); // 4. 생성자 오버로드 하면 오류 생김, 기본생성자를 다시 정의 해줘야 함. 기본생성자를 쓰면 오류 해결
//		
//		
//		/*
//		 * 		person1.name = "김준일";  //3.person 에서 접근지정자 private을 주면 여기서 오류- person에서 생성자를 만들어 주면 해결
//		//생성자 특징 :생성자는 반환 자료형이 없다. 클래스와 이름이 똑같다.
//		
//		 */
//		
//		
//		person1.setName("김준일");
//		System.out.println(person1.getName());
		
		
		
		// 2에서 처럼 반복된거를 해결해 주기 위해 1에서 반복과 배열을 써서 해결
		//2
		String name1 = "김준일";
		String name2 = "서재효";
		String name3 = "전나경";
		int age1 = 29;
		int age2 = 25;
		int age3 = 23;
		
		System.out.println("1번 사람(이름): " + name1);
		System.out.println("2번 사람(이름): " + name2);
		
		
		
	}

	@Override
	public String toString() {
		return "PersonMain [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
