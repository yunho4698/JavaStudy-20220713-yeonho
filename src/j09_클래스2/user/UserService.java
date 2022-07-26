package j09_클래스2.user;

import java.util.Scanner;

public class UserService {
	private Scanner scanner;
	private User[] userArray;
	
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[유저 등록 시스템]");
		System.out.println("1. 유저 등록");
		System.out.println("2. 유저 리스트 조회");
		System.out.println("q. 프로그램 종료");
		System.out.println("메뉴선택 >> ");
		
		select = scanner.nextLine();
		if(select.equals("1")) {
			User user = addUser();
			if(user != null) {
				System.out.println(user.toString());
			}
		}else if(select.equals("2")) {
			
			System.out.println(userArray[i].getUsername());
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중 ...");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택할 수 없습니다.");
			System.out.println("다시 입력하세요.");
		}
		System.out.println();
		return true;
		
		
		
	}
	
	
		
	private User addUser() {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				continue;
			}
			userArray[i] = inputUser();
			System.out.println("[ " + userArray[i].getUsername() + " ] 유저등록");
			return userArray[i];
		}
		System.out.println("더 이상 유저를 등록 할 수 없습니다.");
		
		return null;
	}
	

	private User inputUser() {
		String username = null;
		int password = 0;
		String name = null;
		String email = null;
		
		System.out.println("[유저등록");
		
		System.out.print("사용자 이름 >> ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호 >> ");
		password = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("이름 >> ");
		name = scanner.nextLine();
		
		System.out.print("이메일 >> ");
		email = scanner.nextLine();
		
		
		
		return new User(username, password, name, email);
	}
}
