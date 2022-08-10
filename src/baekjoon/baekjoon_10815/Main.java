package baekjoon.baekjoon_10815;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		int inputNum;
		inputNum = scanner.nextInt();
		for(int i = 0; i < inputNum; i++) {
			int arrayNum;
			arrayNum = scanner.nextInt();
			num.add(arrayNum);
		}
		
		System.out.println(num);
		
		int inputNum2;
		inputNum2 = scanner.nextInt();
		for(int i = 0; i < inputNum2; i++) {
			int arrayNum2;
			arrayNum2 = scanner.nextInt();
			num2.add(arrayNum2);
		}
		
		System.out.println(num2);
		System.out.println(num2.get(1));
		System.out.println(num2.get(2));
		System.out.println(num2.get(3));
		
		
		for(int i = 0; i < num2.size(); i++) {
			for(int j = 0; j < num.size(); j++) {
				if(num2.get(i).equals(num.get(j))) {
					System.out.print("1");
					
				}
				
			}
				continue;
		}
			System.out.println("0");
		
		
	}

}
