package baekjoon.baekjoon_10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N;
		if(0 < N) {
			for(int i =1; i < N; i++) {
				n = n * (N -i);
			}
			System.out.println(n);
		}
		if(N == 0) {
			System.out.println("1");
		}
	}
}
