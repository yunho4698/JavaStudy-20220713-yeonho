package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
	

	private final String email;  //final을 달면 email 이 상수가 됨, 상수는 무조건 초기화를 해야함
	private String name;
	@NonNull   //Requir~ 을 쓰면 nonnull을 무조건 달아줘야함. 
	private String username;
	@NonNull  //밑에 값을 무조건 넣어야 함. (3)
	private String password;
	

}
