package J01_출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1 = '최';
		char name2 = '연';
		char name3 = '호'; //문자
		//char name4= '최연호'; 이거 안됨
		String name = "최연호";
		
	
		int age = 26;
		System.out.println(name1);
		
		System.out.println("결과: "+10 +20);  //결과의 ""와 10을 더해 버리니깐 문자열로 바뀜 -> 뒤에 20도 문자열의 더하기로 봄
		System.out.println("결과: "+(10 +20)); 
		
		String address = "부산 동래구 온천동";
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 온천동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("최연호");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 온천동");
		System.out.println();
	}

}
