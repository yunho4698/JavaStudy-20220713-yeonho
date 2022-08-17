package baekjoon.baekjoon_10870;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		
		for(int i = 0; i < 21; i++) {
			list.add(list.get(i) + list.get(i + 1));
		}
		
		int n = sc.nextInt();
		System.out.println(list.get(n));
		
	}

}
