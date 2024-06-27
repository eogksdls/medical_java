package p0627;

// 클래스를 상속받아 수현 extends
// 인터페이스를 상속받아 구현 implements

abstract public class Fighter extends Unit implements Fightable {

	Fighter(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	abstract public void attack(Unit u);
	

}
