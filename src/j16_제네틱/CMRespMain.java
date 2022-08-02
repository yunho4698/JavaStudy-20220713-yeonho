package j16_제네틱;

import j15_스태틱.싱글톤.Car;

public class CMRespMain {

	public static void main(String[] args) {
		//자동차를 한대 생성해줘
		Car car = Car.builder()
				.company("현대")
				.model("쏘나타")
				.color("화이트")
				.build();
		
		CMRespDto<Car> cmRespDto1 = new CMRespDto<Car>(1, "차량 생성 완료", car);
		System.out.println("응답결과: " + cmRespDto1);
		
		//해당 차량이 현대자동차인지 확인해줘
		CMRespDto<?> cmRespDto2 = null;  // ?는 와일드 카드 같이 씀. 해당 제네틱이 뭐든 들어와도 된다는 뜻
		
		if(car.getModel().equals("현대")) {
			cmRespDto2 = new CMRespDto<>(1, "현대자동차 맞음", car);  //<Car>
			
		}else {
			cmRespDto2 = new CMRespDto<>(-1, "현대자동차 아님", false); //<Boolean> 위에와 같이 카와 boolean 이었는데 이걸 빼줘도 그에 맞는 객체를 들고옴

		}
		System.out.println("응답결과: " + cmRespDto2);
		
	}

}
