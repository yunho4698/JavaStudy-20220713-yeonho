package J06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x를 입력하세요: ");
		x = sc.nextInt();
		System.out.print("y를 입력하세요: ");
		y = sc.nextInt();
		
		if(x==0 || y==0) {
			System.out.println("입력값이 잘못되었습니다.");
		}else if(x>0 && y>0){
			System.out.println("제 1사분면 입니다.");
		}else if(x<0 && y>0) {
			System.out.println("제 2사분면 입니다.");
		}else if(x<0 && y<0) {
			System.out.println("제 3사분면 입니다.");
		}else {
			System.out.println("제 4사분면입니다.");
		}
		
		
		
		
		
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과: " + result);
	}

}
