package p0627;

public class C0627_03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			//예외가 발생 될 것 같은 경우
			System.out.println(3);
			
			System.out.println(0/0); //error
			System.out.println(4);
			
		}catch (Exception e) { //예외 발생시 try문을 빠져나와 catch문을 출력함
			System.out.println(5);
			e.printStackTrace(); //어떤 이유로 예외가 발생했는지 알려줌
		}
		
		System.out.println(6);
	}
}
