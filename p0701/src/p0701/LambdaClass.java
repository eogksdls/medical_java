package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaClass {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			list.add(i);
		}
		
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//list 출력
		list.forEach(i -> System.out.println(i));
	
		list.removeIf(x -> x%2==0 || x%3==0);
		System.out.println(list);
		
		Map<String,String> map = new HashMap();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((str,str2) -> System.out.println("{"+str+","+str2+"}"));
//		map.forEach(data_list()); // forEach()에는 매개변수만 들어올 수 있고, 함수는 들어오지 못한다.
		
		
	}
	
	public static Integer data_list() {
		return 1;
	}
	
}
