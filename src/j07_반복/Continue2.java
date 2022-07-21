package j07_반복;

public class Continue2 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0 ) {
				continue; //continue를 만나는 순간 내 밑에 있는거는 무시하고 다음 반복으로 넘어가
			}
			System.out.println("i: " + i);
		}
	}

}
