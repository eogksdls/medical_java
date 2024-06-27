package p0624;

public class Calculate2 {
	int result = 0;
	// cal()
	// return result; 사용할 것
	
	int cal(int[] arr, String str) {
		
		switch(str) {
		case "+":
			result = arr[0] + arr[1];
			break;
		case "-":
			result = arr[0] - arr[1];
			break;
		case "*":
			result = arr[0] * arr[1];
			break;
		case "/":
			result = arr[0] / arr[1];
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			
		}
		
		return result;
	
	}
}
