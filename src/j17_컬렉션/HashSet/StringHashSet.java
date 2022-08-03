package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set =new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("1");
		set.add("2");
	
		System.out.println(set);
		//값 조회
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			if(ir.next().equals("java")) {
				System.out.println(str);
			}
		}
		//값을 넣어준 순서가 없기에 수정이 안됨. 지우고 다시 추가하는게 수정임.
		
	}

}
