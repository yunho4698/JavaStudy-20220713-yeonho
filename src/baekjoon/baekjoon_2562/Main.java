package baekjoon.baekjoon_2562;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i <9; i++) {
			
			int num = scanner.nextInt();
			numList.add(num);
		}
		
		
		int maxNum = 0;
		for(int i = 0; i < numList.size(); i++) {

			if(numList.get(i) > maxNum) {
				maxNum = numList.get(i);
			}
		}
		
		for(int i = 0; i < numList.size(); i++) {
			if(numList.get(i).equals(maxNum)) {
				System.out.println(maxNum);
				System.out.println(i+1);
			}
		}
	}

}

