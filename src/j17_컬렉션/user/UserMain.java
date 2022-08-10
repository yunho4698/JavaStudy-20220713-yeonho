package j17_컬렉션.user;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
	public static Map<String, String> addUser(){
		Scanner scanner = new Scanner(System.in);
		
		
		Map<String, String> user = new HashMap<String, String>();
		System.out.println("아이디: ");
		user.put("username", scanner.nextLine());
		System.out.println("비밀번호: ");
		user.put("password", scanner.nextLine());
		System.out.println("아이디: ");
		user.put("name", scanner.nextLine());
		
		System.out.println();
		
		return user;
		
	}
	public static void main(String[] args) {
		Set<Map<String, String>> userSet = new HashSet<Map<String, String>>();
		
		userSet.add(addUser());
		userSet.add(addUser());
		userSet.add(addUser());

		
		userSet.forEach(map -> { // forEach 안에는 consumer 들어가 있음
			// 꺼낼때는 포이치, 이터레이터 두개 다쓸수 있는데 그때ㅐ끄댸 적절한거 쓰
			System.out.println("아이디: " + map.get("username"));
			System.out.println("비밀번호: " + map.get("password"));
			System.out.println("이름: " + map.get("name"));
			System.out.println();
		});
		
	}

}
