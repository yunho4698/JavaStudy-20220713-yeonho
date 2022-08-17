package baekjoon.baekjoon_2798;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
		
	}


	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		for(int i = 0; i < N -2; i++) {
			//첫번째 카드, 뒤에 두자리 남겨놔야지 2,3번째 카드 뽑을 수 있음(N -2)
			for(int j = i + 1; j < N -1; j++) {
				//두번째 카드
				for(int k = j + 1; k < N; k++) {
					//세번째 카드
					
					int temp = arr[i] + arr[j] + arr[k];
					
					if(M == temp) {
						return temp;
					}
					if(result < temp && temp < M) {
						result = temp;
						//세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱
					}
				}
			}
		}
		return result;
	}
}
