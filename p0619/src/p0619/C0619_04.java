package p0619;

import java.util.Arrays;

public class C0619_04 {
	
	public static void main(String[] args) {
		int[] score = {1,2,3,4,5};
		System.out.println(score); // score는 주소값을 저장함 -> [I@65ae6ba4
		int[] score2 = score; // 배열 복사 : 주소값까지 저장해버리기 때문에(얕은 복사)
		
		int[] score3 = new int[5]; // 번거롭다!
		for (int i=0;i<5;i++) {
			score3[i] = score[i];
		}
		
		int[] score4 = new int[5];
		// score 배열의 0번째부터 5개를 score4 배열의 0번째에 복사
		System.arraycopy(score, 0, score4, 0, score.length);
		System.out.println(Arrays.toString(score4));
		
		score[4] = 0; //으로 score만 값을 수정해도
		// score2의 값 또한 바뀐다.
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score3));
		
		
//		// 변수를 복사했을 때, 기존의 값이 변경이 된다고해서 복사한 값이 변경되지 않음.
//		int num = 10;
//		int num2 = num; // num,num2는 서로 다른 저장소에 값을 저장
//		num = 5;
//		System.out.println(num); //5
//		System.out.println(num2); //10
	}
}
