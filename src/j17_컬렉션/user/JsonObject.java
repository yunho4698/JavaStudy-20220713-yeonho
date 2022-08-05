package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {

	public static void main(String[] args) {
		/*
		 * 맵 만들고
		 * 맵 벨류에 오브젝트
		 * 리스트만들고 리스트의 맵에 상세값 넣기
		 * 리스트를 맵 벨류에 넣기
		 */
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> todomap1 = new HashMap<String, Object>();
		todomap1.put("name", "bulbasaur");
		todomap1.put("url", "https://1");
		
		Map<String, Object> todomap2 = new HashMap<String, Object>();
		todomap1.put("name", "ivysaur");
		todomap1.put("url", "https://2");
		
		Map<String, Object> todomap3 = new HashMap<String, Object>();
		todomap1.put("name", "vanusaur");
		todomap1.put("url", "https://3");
		
		//위의 맵을 리스트에 넣기
		
		list.add(todomap1);
		list.add(todomap2);
		list.add(todomap3);
		
		map.put("count", 1118);
		map.put("next", "htttps://limit=3");
		map.put("previous", "@@");
		map.put("contents", todomap1);
		map.put("contents", todomap2);
		map.put("contents", todomap3);
		
		System.out.println(map);
		
		
		
	}

}
