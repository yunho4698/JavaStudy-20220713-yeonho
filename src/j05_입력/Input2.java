package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
	     /*
	     * Scanner
	     * 이름 : 김준일					next()				name
	     * 나이 : 29						nextInt()			age
	     * 주소 : 부산 동래구 사직동		nextLine()			address
	     * 연락처 : 010-9988-1916			next()				phone
	     * 
	     * 사용자의 이름은 김준일 이고 나이는 29살입니다.
	     * 주소는 부산 동래구 사직동에 거주중입니다.
	     * 연락처는 010-9988-1196 입니다.
	     * 
	     */
		// 한줄 주석
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름을 입력하세요:");
		name = scanner.next();
		
		System.out.print("나이를 입력하세요:");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소를 입력하세요: ");
		address = scanner.nextLine();
		
		System.out.print("연락처를 입력하세요:");
		phone = scanner.next();
		
		System.out.println();
		System.out.println("사용자의 이름은"+name+ "이고 나이는" + age + "입니다.");
		System.out.println("주소는 "+ address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
		
		
		
	}

}
