package baekjoon.baekjoon_14425;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//집합 S 에 5개의 문자열 이 주어짐
		//검사해야 하는 단어의 수는 11개
		//몇개가 포함되어있는지 출력하면 됨.
		
		Scanner scanner = new Scanner(System.in);
		

		
		HashSet<String> N = new HashSet<String>();
		int nN = scanner.nextInt();
		int nM = scanner.nextInt();
		HashMap<Integer, String> M= new HashMap<Integer, String>();
		scanner.nextLine();
		
		for(int i = 0; i < nN; i++) {
			N.add(scanner.nextLine());
		}
		
//		System.out.println(N);
		
		for(int i = 0; i < nM; i++) {
			String sc = scanner.nextLine();
			M.put(i, sc);
		}


		
		int result = 0;
	
		Iterator<String> ir = N.iterator();


//			while(ir.hasNext()) {
//				for(int i = 0; i < nM; i++) {
//				if(ir.next().equals(M.get(i))) {
//					result = result + 1;
//				}
//			}
//		}
			
			for(int i = 0; i < nM; i++) {
				if(N.contains(M.get(i))) {
					result++;
				}
				
			}

		System.out.println(result);
		
	}

}
