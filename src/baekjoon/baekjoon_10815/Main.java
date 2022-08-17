//package baekjoon.baekjoon_10815;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Main {
//
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		int N = Integer.parseInt(br.readLine()); //카드의 개수
//		int [] cards = new int[N]; //개수를 배열의 크기로 선언
//		
//		st = new StringTokenizer(br.readLine());  //StringTokennizer를 통해 따로 입력받음
//		for (int i = 0; i < N; i++) {
//			cards[i] = Integer.parseInt(st.nextToken()); //따로 입력받은 값들을 배열에 한개씩 삽입
//		}
//		
//		Arrays.sort(cards); //이분탐색할 배열을 오름차순으로 정리, 그냥 배열이니깐 오름차순으로 정리 가능
//		
//		int M = Integer.parseInt(br.readLine());  //구별할 카드 수의 개수
//		
//		StringBuilder sb = new StringBuilder();
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < M; i++) {
//			int temp = Integer.parseInt(st.nextToken());
//			sb.append(binarySearch(cards, N, temp) + " "); 
//		}
//		
//		bw.write(sb.toString() + "\n");
//		bw.flush();
//		bw.close();
//		br.close();
//		
//		
//		
//	}
//
//	private static int binarySearch(int[] cards, int N, int search) {
//		int first = 0;
//		int last = N - 1;
//		int mid = 0;
//		
//		while(first <= last) {
//			mid = (first + last) /2; //중간 인덱스
//			
//			if(cards[mid] == search) { //중간값과 찾으려는 수가 같은경우
//				return 1;
//			}
//			
//			if(cards[mid] < search) { //중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요없음.
//				first = mid + 1;
//			} else { //중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
//				last = mid - 1;
//			}
//		}
//		return 0;
//	}
//
//}
