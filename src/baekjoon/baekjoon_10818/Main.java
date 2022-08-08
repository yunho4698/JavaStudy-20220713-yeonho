package baekjoon.baekjoon_10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

				int[] num = new int[number];
				for(int i = 0; i < number; i++) {
					num[i] = scanner.nextInt();
				}
				Arrays.sort(num);
				System.out.println(num[0] + " " + num[number - 1]);
			
		

}
}
