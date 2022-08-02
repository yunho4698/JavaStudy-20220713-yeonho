package j16_제네틱;

import lombok.Data;

@Data
public class GenericTest<K, V> {
	private K key;
	private V value;
	
	//T, E 아무거나 와도됨. 일반적으로 t는 type ,e 는 elements (객체)
	//의미부여일 뿐이지 기능적으로는 아무거나 와도 상관 없음.
}
