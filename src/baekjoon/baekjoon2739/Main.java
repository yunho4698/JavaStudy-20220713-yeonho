package baekjoon.baekjoon2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();
		int x= 1;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " +(num * i));
		}
	}

}
