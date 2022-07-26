package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * names 배열 5개
		 * studentYears 배열 5개
		 * scroes 배열 5개
		 * 
		 * 박진관 3 75.9
		 * 조문기 2 80.5
		 * 서재효 4 85.7
		 * 임나영 3 88.3
		 * 전나경 4 78.5

		 * 박진관 \t3학년  \t75.9점
		 * 조문기 2 80.5
		 * 서재효 4 85.7
		 * 임나영 3 88.3
		 * 전나경 4 78.5
		 */
		
		String[] names = {"박진관", "조문기", "서해효", "임나영", "전나경"};
		int[] studentYears = {3, 2, 4, 3, 4};
		double[] scores = {75.9, 80.5, 85.7, 88.3, 78.5};
		
		for(int i = 0; i< 5; i++) {
			System.out.println(names[i] + "\t" + studentYears[i] + "학년\t" + scores[i] + "점");
		}
		
		Student[] students = new Student[5];
		students[0] = new Student ("김준일", 3, 29, "부산", "010-9988-1916");
		
		for(int i = 0; i < 5; i++) {
			/*
			 * 			if(students[i] == null) {
				continue;
			}
			System.out.println("이름: " + students[i].getName());
		}
		
		밑에 먼가 수행해야 할 것이 없을때 continue, 밑에 먼가 해야할것이 있을때는 아래와 같이.
			 */
			if(students[i] != null) {
				System.out.println("이름: " + students[i].getName());
			}
		}
		
	}

}
