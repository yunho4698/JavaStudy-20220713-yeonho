package j20_예외처리;

public class ExceptionTest2 {

	public void printArray() throws Exception {//예외가 일어날 거 같으면 달아줘야함
		int[] numArray = new int[] { 1, 2, 3, 4, 5 };
		
		if(0 == 0) throw new CustomException("내가 만든 예외 강제로 발생");
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println(numArray[i]);
		}
	}
}
