package p0627;

public class C0627_01 extends Object {

	public static void main(String[] args) {
		Marine m = new Marine(); //보병 1명
		System.out.println("Marine 현재 체력 : "+m.hitPoint);
		
		Tank t = new Tank();
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		
		Dropship d = new Dropship();
		System.out.println("Dropship 현재 체력 : "+d.hitPoint);
		
		System.out.println("Tank가 포탄을 맞았습니다.");
		hpDown(t); // t.hitPoint -= 10;
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		hpDown(d); // d.hitPoint -= 10;
		hpDown(d);
		System.out.println("Dropship 현재 체력 : "+d.hitPoint);
		hpDown(m);
		hpDown(m);
		hpDown(m);
		System.out.println("Marine 현재 체력 : "+m.hitPoint);
		
		
		
		// Scv 는 기계를 수리할 수 있는 능력
		System.out.println("------------------------");
		System.out.println("Tank 수리를 진행합니다.");
		Scv s = new Scv(); //객체선언
		s.repair(t); // 탱크 수리
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		
		System.out.println("Dropship을 수리요청합니다.");
		s.repair(d);
		System.out.println("Dropship 현재 체력 : "+d.hitPoint);
		
		System.out.println("Marine을 수리요청합니다."); // 사람은 수리가 안됨
//		s.repair(m);
		System.out.println("Marine 현재 체력 : "+m.hitPoint);
		
		
	
	
	}
	
	static void hpDown(Unit u) {
		u.hitPoint -= 10;
	}

}
