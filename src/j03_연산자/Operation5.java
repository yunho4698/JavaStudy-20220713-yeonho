package j03_연산자;


public class Operation5 {

	public static void main(String[] args) {
		/*
		 * 시험 성적 결과 계산 프로그램
		 * score = 88
		 * result = 문자열
		 * 
		 * 1. score 가 0보다 작거나 100보다 크면 (계산불가)
		 * 2. 89보다 크면 (A학점)
		 * 3. 79보다 크면 (B학점)
		 * 3. 69보다 크면 (C학점)
		 * 3. 59보다 크면 (D학점)
		 * 3. 나머지는 (F학점)
		 * 
		 * 
		 * 결과 : 계산 불가
		 */
		
		/*내 답
		int score = 85;
		String result = score < 0 || score > 100 ? "계산불가" : "" ;
				
		System.out.println(score > 89 ? "A학점"
				: score > 79 ? "B학점"
				: score >69 ? "C학점"
				: score > 59  ?"D학점"
				: "F학점");
		*/
		
		int score = 85;
		String result = null;
		result = score < 0 || score > 100 ? "계산 불가"
				: score > 89 ? "A학점"
				: score > 79 ? "B학점"
				: score > 69 ? "C학점"
				: score > 59 ? "D학점"
				: "F학점";
		System.out.println("결과: " + result);	
	
		

				
		
		
	}

}
