package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;


@Getter
public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
	// 생성자 호출시에 객체 생성
	// 호출이란 메인에서 이제 userArrayList 클래스에 있는 것을 쓰려고 주소값을 받아서 어떤것을 만들어주기 위한것
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	

	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		
		
		
		
		//입력
		System.out.println("아이디: ");
		username = scanner.nextLine();
		
		System.out.println("비밀번호: ");
		password = scanner.nextLine();
		
		System.out.println("이름: ");
		name = scanner.nextLine();
		
		
		System.out.println("이메일: ");
		email = scanner.nextLine();
		
		
		
		// User 객체 생성
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		
					
		// userList에 add
		userList.add(user);
	}
	
	
	public void printUserList(){
		//userList 출력(toString 쓰지 말고)
		/*
		 * 아이디	> aaa
		 * 비밀번호	> 1234
		 * 이름		> 김준일
		 * 이메일	> aaa@naver.com
		 * 
		 * 아이디 	> bbb
		 * 비밀번호 > 2222
		 * 이름		> 김준이
		 * 이메일 	> bbb@naver.com
		 * 위의 형태로 나오게
		 */
//		System.out.println(userList);
//		for(int i = 0; i < userList.size() - 3; i++) {
//			System.out.println("아이디" + "\t" + userList.get(i));
//			System.out.println("비밀번호" + "\t" + userList.get(i + 1));
//			System.out.println("이름" + "\t" + userList.get(i + 2));
//			System.out.println("이메일" + "\t" + userList.get(i + 3));
//
//		}
		
		for(User user : userList) {
			System.out.println("아이디\t > " + user.getUsername());
			System.out.println("비밀번호\t > " + user.getPassword());
			System.out.println("이름\t > " + user.getName());
			System.out.println("이메일\t > " + user.getEmail());
			System.out.println();
		}
		
		
	}
	
	public void removeUser() {
//		String removeName = null;
//		UserArrayList userArrayList = new UserArrayList();
//		//아이디 입력
//		//해당아이디를 가진 값만 아이디에서 지우기
//		System.out.println("아이디: ");
//		removeName = userArrayList.getScanner().nextLine();
//		
//		for(int i = 0; i < userList.size(); i++) {
//			if(user.getUsername().equals(removeName)) {
//				
////			}
//		}
		String username = null;
		String password = null;
		
		System.out.println("아이디: ");
		username = scanner.nextLine();
		
		for(User user : userList) {
			if(user.getUsername().equals(username)) {
				System.out.println("비밀전호: ");
				password= scanner.nextLine();
				
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					System.out.println(user);
					System.out.println("삭제완료.");
					return;
				}else {
					System.out.println("비밀전호가 일치하지 않습니다.");
					return;
				}
			}
		}
		System.out.println("해당 아이디는 존재하지 않습니다.");
		
	}

	
	public static void main(String[] args) {
		UserArrayList userArrayList = new UserArrayList();
		/*
		 * [ 사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 상요자 삭제
		 * q. 프로그램 종료
		 */
		
		while(true) {
			String select = null;
			
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.println("메뉴 선택 >");
			
			select = userArrayList.getScanner().nextLine();
			//스태틱이라서 위에서 생성하고 여기서 그걸 쓰는 거임
			//메인에서 스캐너를 다시 만들어도 되지만 굳이 또 만들 필요가 없고 위에거를 쓰는거를 어떻게 쓰는지 알기 위해 사용
			
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printUserList();
			}else if(select.equals("3")) {
				userArrayList.removeUser();
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당 번호는 사용할 수 없는 기능입니다.");
			}
			
		}
		
		
		
		
	}

}
