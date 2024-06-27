package p0621;

public class Cal {
	
	// 메소드
	int add(int a, int b) {
		int result = a + b;
		
		int num  = minus(10,5);
		System.out.println("minus : "+num);
		// 메소드 안 또 다른 메소드 선언은 안됨.
//		int add2(int k, int m) {
//			
//		}
		
		return result;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
}
