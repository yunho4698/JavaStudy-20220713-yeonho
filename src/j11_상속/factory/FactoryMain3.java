package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		//업캐스팅
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		int num = 10;
		double dNum = (double) num;
		
		System.out.println((double) num);

		int n = (int) dNum;
		
		double d = 3.14; //Factory
		int i = (int) d; //Factory -> SamsungFactory
		
		SamsungFactory sfactory = new SamsungFactory(1);
		Factory f = (Factory) sfactory;
		
		System.out.println(f);
		
		SamsungFactory sf = (SamsungFactory) f;
		
		//업캐스팅은 묵시적 형변환이 되지만 다운캐스팅은 안됨
		//다운캐스팅은 적어줘야함
		
		Factory factory = new Factory(1);
		SamsungFactory samsungFactory = (SamsungFactory) factory;

	}
}
