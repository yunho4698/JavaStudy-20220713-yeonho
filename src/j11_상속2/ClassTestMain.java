package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		((ClassA) new ClassB()).showData();;
		
		ClassB bb = new ClassB();  //4
		
		ClassA aa = bb;  // 묵시적 형변환  //5
		//ClassA aa = (ClassA) bb;  // 2. 1에서 매번 이렇게 쓰는게 귀찮아서 담아버린다.
		
		ClassA aaa = new ClassB();   // 4,5번 두번 한거를 한번에 해결
		
		((ClassA) bb).showData(); 
		((ClassA) bb).printInfo();
		
		aa.showData();  //2번을 사용한거
		aa.printInfo();
		
		ClassA b = new ClassB(); //ClassB 를 ClassA로 적어주는게 업캐스팅
		b.printInfo();
		b.showData();
		
		ClassA c = new ClassC();  
		c.printInfo();  //c 는 부모 A거를 받았기에 prinInfo를 받을 수 있음.
		//new ClassC().printInfo();  
		//new ClassC와 c 는 모두 주소 이지만 new ClassC 는 계속 새로운 주소를 만드니깐 c라는 변수를 놔둬서 똑같은 주소로 계속 생성
		c.showData();
		
		
		
		
	}

}
