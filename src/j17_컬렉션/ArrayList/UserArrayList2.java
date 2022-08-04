package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;


@Getter
public class UserArrayList2 {
/*
 * 관리자 프로그램(추가, 리스트, 제거, 종료)
 * 유저의 내용은  User에서 들고올거임
 * 
 * 
 */
	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList2() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//값을 입력받기 위해 userArrayList 에 있는 스캐너 쓸거임.
		UserArrayList2 userArrayList2 = new UserArrayList2();
		String select = null;
		
		System.out.println("관리자프로그램");
		System.out.println("1. 추가");
		System.out.println("2. 리스트조회");
		System.out.println("3. 제거");
		System.out.println("q. 종료");
		select = userArrayList2.getScanner().nextLine();
		//입력 받아야함
		
		//입력 받은 값에 따라 해당 메서드로 이동할거임
		
		if(select.equals("1")) {
			//추가메소드
			userArrayList2.addUser();
		}else if(select.equals("2")) {
			//리스트 조회 메소드
			
		}else if(select.equals("3")) {
			//제거 메소드
			
		}else if(select.equals("q")) {
			System.out.println("종료합니다.");
			break; //
		}else {
			System.out.println("값을 잘 못 입력하셨습니다.");
		}
		
		
		
	}
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디: ");
		username = scanner.nextLine();
		
		System.out.println("비밀번호: ");
		password = scanner.nextLine();
		
		System.out.println("이름: ");
		name = scanner.nextLine();
				
		System.out.println("이메일: ");
		email = scanner.nextLine();
		
		User user = User.builder()
						.username(username)
						.password(password)
						.name(name)
						.email(email)
						.build();
		
		
		userList.add(user);  //이거 하기전에 위에 유저라는 객체를 생성해야함
		//유저는 빌더 빌드로 만들거임
	}
	
	public void removeUser() {
		System.out.println("ID: ");
	}

}
