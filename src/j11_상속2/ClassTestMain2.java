package j11_상속2;

public class ClassTestMain2 {

	public static void main(String[] args) {
		int num = 10;
		int[] numbers = new int[2];
		numbers[0] = num;
		
		System.out.println(numbers[0]);
		
		
		ClassA b = new ClassB();                                             //생성
		ClassA[] arrayA = new ClassA[2];
		arrayA[0] = b;
		arrayA[1] = new ClassC();  //굳이 변수에 안넣고 바로 넣어도 됨         //생성
		
		
		
		arrayA[0].printInfo();  //0 배열 안에 b의 주소가 들어있으니깐 .을 찍어서 참조가 가능      //오버라이드된 값 나옴
		arrayA[1].printInfo();                                                                       //오버라이드 된 값 나옴
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i].printInfo();
			
			// 배열 세개 만들면 널포인트 에러
			//  첫번쨰 B.print~  두번쨰 C.~  세번째 null,printInfo() 이래서 에러가 발생
			
			
			//B,C 가 단독으로 가지고 있는 것은 전직 스킬
			//A에서 쓰려고 포기해야함.(업캐스팅)
			//이 스킬을 쓰기 위해서 필요한거 다운캐스팅
			
			//A에서 B로 바로 다운캐스팅이 아닌 B-A-B 순서를 지켜야 다운캐스팅이 됨
			//다운캐스팅은 명시적 형변환
		}
		
		ClassB b2 = (ClassB) arrayA[0];  //(ClassB)가 다운캐스팅 해주는 형태임, 다운캐스팅된 주소를 b2에 저장, b2 는 변수임 객체랑 헷갈리면 안됨, 변수는 주소를 담고 있는거
		
		
		
		if(arrayA[0] instanceof ClassB) {
			System.out.println("클래스 B였음");
		}else {
			System.out.println("클래스 B가 아님");
		}
		
		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[i] instanceof ClassB) {
				ClassB b3 = (ClassB) arrayA[i];
				b3.addData();
			}else if(arrayA[i] instanceof ClassC) {
				ClassC c3 = (ClassC) arrayA[i];
				c3.removeData();
			}else {
				System.out.println("다운캐스팅 불가");
			}
		}
		
		System.out.println(b2);  //b2가 변수이면 이 변수에 있는 것을 모두 다 보게 하는거 먼지 확인
		
		
		
	}

}
