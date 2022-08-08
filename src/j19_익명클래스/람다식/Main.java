package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
		//100.5 + 200.5 = 301.0 이라는 결과 나오게 만들기
		
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath.calc(10, 20));
		
		

	
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {


			@Override
			public double calc(Double value1, Double value2) {
				System.out.println("value1: " + value1);
				System.out.println("value2: " + value2);
				return value1 + value2;
			}
		};
		System.out.println(plusMath2.calc(100.5, 200.5));
		
		Math<Double, Double> plusMath3 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;
			}; // 익명 클래스를 정의한거 
		//(v1, v2) 매개변수를 정의한거
		// -> : calc 라는 메소드
		// 뒤에가 이제 return
		// 중괄호를 열면 return 값을 달아줘야 함.
		// 중괄호 없으면 그냥 v1 + v2 만 적어줘도 됨(plusMath4)
		
		System.out.println(plusMath3.calc(50.5, 10.4));
		
		
		Math<Double, Double> plusMath4 = (v1, v2) -> v1 + v2;
		
	}
}
