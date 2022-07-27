package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		
		/*
		 * Factory Array 20(배열의 크기)
		 * 
		 * 배열의 인덱스가 짝수이면 SamsungFactory 생성해서 대입
		 * 홀수이면 LGFactory 생성해서 대입 - 반복문써서 만들기
		 * 
		 * 삼성공장 1 ~ 10 (2,4,6 이렇게 만들어지면 안되고 123으로 만들어져야함)
		 * LG공장 1 ~ 10
		 * 
		 * 모든 공장 가동(삼성1)
		 * 모든 공장 생산(삼성1)
		 * 모든 공장 중지(삼성1)
		 * 
		 * 모든 공장 가동(LG1)
		 * 모든 공장 생산(LG1)
		 * 모든 공장 중지(LG1)
		 * 
		 * 
		 */
		
		
		//업캐스팅
		Factory[] factories = new Factory[20];
		
		for(int i = 0; i < factories.length; i++) {
			if(i % 2 == 0) {
				factories[i] = new SamsungFactory((i+2) / 2);
			}else {
				factories[i] = new LGFactory((i + 1) / 2);
			}
		}
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			if(i % 2 == 0) {
				SamsungFactory samsungFactory = (SamsungFactory) factories[i];
				samsungFactory.produceSmartPhone();
			}else {
				LGFactory lgFactory = (LGFactory) factories[i];
				lgFactory.produceSmartTv();
			}
			

			factories[i].stop();
			System.out.println();
			/*
			 * factories[i].start();
			 * if(factories[i] instanceof SamsungFactory){
			 * ((SamsungFactory) factories[i]).produceSmartPhone();
			 * }else{
			 * ((LGFactory) factories[i]).produceSmartTv();
			 * }
			 * 선생님 답
			 */
			
		}
		
		}

	}

