package p0625;

public class C0625_05 {

	public static void main(String[] args) {
		Time t = new Time(); // 같은 패키지 내에 있어 import 안해도 됨
		t.setHour(45); //Time class 에서 private 접근 차단
		t.day = 50;
		
		System.out.println("현재시간 : "+t.getHour()+" 시");
		System.out.println("현재날찌 : "+t.day+" 일");
	
	}

}
