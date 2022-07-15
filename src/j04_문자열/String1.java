package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		String address = "부산시 동래구 사직동";
		//문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		int index = address.lastIndexOf("동");
		System.out.println(index);
		String subAddress = address.substring(1, 5);
		System.out.println(subAddress);
		//해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		int index2 = address.indexOf("동");
		int index3 = address.lastIndexOf("동") + 1;
		String subAddress1 = address.substring(index2, index3);
		String subAddress2 = address.substring(index2);
		//끝까지 다 출력하는 경우는 맨 뒤의 값을 안넣어 줘도 됨.
		String subAddress3 = address.substring(address.indexOf("동"));
		
		System.out.println(subAddress1);
		System.out.println(subAddress2);
		System.out.println(subAddress3);
		
		//해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-");
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/9988/1946, 010/1234/5678";
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(",", "/");
		System.out.println(rePhone);
		
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(",", "/");
			System.out.println(rePhone2);
		
	}

}
