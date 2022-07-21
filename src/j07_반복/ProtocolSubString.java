package j07_반복;

public class ProtocolSubString {
	
	/*
	 * @뒤에 오는 문자열이 명령어
	 * : 뒤에 오는 문자열은 내용
	 * 첫번째 골뱅이 부터 다음 골뱅이까지 짜르고 내용과 명령어를 분리시킬 수 있게 짜르기
	 */
	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21";
		String message = null;
		String to = null;
		String from = null;
		String sendDate = null;
		
		/*
		 * 최연호 풀이
		int index = data.indexOf("@");
		message = data.substring(index + 1);
		int index2 = message.indexOf("@");
		int index3 = data.indexOf(":");
		message = data.substring(index3 + 1, index2);
		
		
		to = data.substring(index2+2);
		int index4 = to.indexOf("@");
		to = data.substring(index2 + 2, index4);
		System.out.println(to);
			
		*/
		// data를 재정의 해서 반복 쓰는거 바로 생각(반복되는거 바로 캐치)
		/*
		while(true)	{
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					:data.substring(contentIndex + 1);
					
			System.out.println(command);
			System.out.println(content);
			if(command.equals("Message")) {
				message = content;
			}else if(command.equals("To")) {
				to = content;
			}else if(command.equals("From")) {
				from = content;
			}else if(command.equals("SendDate")) {
				sendDate = content;
			}
			
			if(nextCommandIndex == -1) {
				break;
			}
			data = data.substring(nextCommandIndex);
		}
		
		System.out.println("Message: " + message);
		System.out.println("To: " + to);
		System.out.println("From: " + from);
		System.out.println("SendDate: " + sendDate);
		*/
		while(true)	{
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					:data.substring(contentIndex + 1);
			System.out.println(command + ": " + content);
			
			if(nextCommandIndex == -1) {
				break;
			}
			data = data.substring(nextCommandIndex);
			}
	}

}
