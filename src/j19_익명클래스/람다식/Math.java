package j19_익명클래스.람다식;


@FunctionalInterface
// 람다형이라고 표시하는거 
// 이렇게 하면 메소드를 두개를 생성할 수 없어서 오류를 해결 할 수 있음.
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);
}
