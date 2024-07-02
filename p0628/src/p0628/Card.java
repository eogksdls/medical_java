package p0628;

public class Card {
	
	enum Kind{SPADE,DIAMOND,HEART,CLOVER}
	
	//	spade,SPADE,Spade,...
	
	private int number;
	private String kind;
	
	Card(){}
	Card(int number,String kind){
		this.number = number;
		this.kind = kind;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int Number) {
		this.number = number;
	}
	
	
	@Override
	public String toString() {
		return String.format("%d,%s",number,kind);
	}
	public String getKind() {
		// TODO Auto-generated method stub
		return null;
	}
}
