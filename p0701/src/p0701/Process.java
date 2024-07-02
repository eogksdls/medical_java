package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Process {
	ArrayList<Card> clist = new ArrayList();
	ArrayList<Students> slist = new ArrayList();
	
	//Card list 보내기
	ArrayList<Card> clistAdd(){
		
		clist.add(new Card(1,"CLOVER"));
		clist.add(new Card(2,"CLOVER"));
		clist.add(new Card(3,"CLOVER"));
		clist.add(new Card(4,"CLOVER"));
		clist.add(new Card(5,"CLOVER"));
		
		return clist;
	}
	
	
	//Students list 보내기
	ArrayList<Students> slistAdd(){
		
		slist.add(new Students("홍길동",100,100,99));
		slist.add(new Students("유관순",80,91,93));
		slist.add(new Students("이순신",88,93,87));
		slist.add(new Students("김구",84,90,96));
		slist.add(new Students("강감찬",91,100,75));
		slist.add(new Students("홍길순",68,79,86));
		
		return slist;
	}
	
	// 2개를 같이 보내기
	HashMap<String,Object> listAdd() {
//		Map<String,Object> map = new HashMap<String,Object>();
		HashMap<String, Object> map = new HashMap<String,Object>();
		// map.put(key,value) => key값은 중복되면 안됨
		map.put("clist", clistAdd()); 
		map.put("slist", slistAdd());
		
		return map; 
	
	
	}
	
	
}
