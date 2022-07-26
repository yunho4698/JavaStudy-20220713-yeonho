package j09_클래스2.user;

import java.util.Scanner;

public class UserService {
	private Scanner scanner;
	private User[] userArray;
	
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	
	private String inputSelect1() {
		System.out.println("메뉴선택 >> ");
		return scanner.nextLine();
	}
	
	private void ErrorMessage() {
		System.out.println("해당 메뉴는 선택할 수 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[유저 등록 시스템]");
		System.out.println("1. 유저 등록");
		System.out.println("2. 유저 리스트 조회");
		System.out.println("q. 프로그램 종료");

		
		select = inputSelect1();
		if(select.equals("1")) {
			User user = addUser();
			if(user != null) {
				System.out.println(user.toString());
			}
		}else if(select.equals("2")) {
			while(showUserSearch()) {}
			
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중 ...");
			return false;
		}else {
			ErrorMessage();
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
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("[유저등록");
		
		System.out.print("사용자 이름 >> ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호 >> ");
		password = scanner.nextLine();
		scanner.nextLine();
		
		System.out.print("이름 >> ");
		name = scanner.nextLine();
		
		System.out.print("이메일 >> ");
		email = scanner.nextLine();
		
		
		
		return new User(username, password, name, email);
	}
	
	private boolean showUserSearch() {
		String select = null;
		System.out.println("[유저조회]");
		System.out.println("1. 유저전체조회");
		System.out.println("2. 이름으로 검색");
		System.out.println("b. 뒤로가기");
		select = inputSelect1();
		
		if(select.equals("1")) {
			showUserList();
		}else if(select.equals("2")) {
			showSearchUser();
			
		}else if(select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
			
		}else {
			ErrorMessage();
		}
		
		return true;
		
	}
	
	private void showUserList() {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				System.out.println(userArray[i].getUsername() + " " 
						+ userArray[i].getPassword() + " " 
						+ userArray[i].getName() + " " 
						+ userArray[i].getEmail());
			}

		}
	}
	
	private void showSearchUser() {
		String searchname = null;
		System.out.print("이름을 입력 >>");
		searchname = scanner.nextLine();
		
		User searchUser = searchUserByUserName(searchname);
		if(searchUser != null) {
			System.out.println(searchUser.toString());
		}
	}
	
	private User searchUserByUserName(String searchName) {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				String username = userArray[i].getUsername();
				if(searchName.equals(username)) {
					return userArray[i];
				}
			}
		}
		System.out.println("해당 이름의 학생은 존재하지 않습니다.");
		return null;
	}{

	}
	
	
	
	

	private String inputSelect() {
		// TODO Auto-generated method stub
		return null;
	}
}
