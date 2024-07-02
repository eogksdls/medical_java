package p0701;

public class C0701_01 {

	public static void main(String[] args) {
		Card c = new Card();
//		c.password = "1111";
		c.setNumber(15); //13이상의 수는 값이 안들어감
		c.setNumber(10);
		System.out.println(c.getNumber());
//		System.out.println(c.password);
		
	}

}
