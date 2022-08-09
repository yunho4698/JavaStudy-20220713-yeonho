package baekjoon.baekjoon_2577;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int num = scanner.nextInt();
			numList.add(num);
		}
		
		int abc = numList.get(0) * numList.get(1) * numList.get(2);
		
		String str = Integer.toString(abc);
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}
