package p0619;

public class C0619_06 {
	
	public static void main(String[] args) {
		//[5][5] 배열을 생성해서 1-25의 숫자를 입력하고, 랜덤으로 섞은 후 출력하시오!
		int[][] arr = new int[5][5];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = i*5 + (j+1); //1-25
			}
		}// for문
		//-----------------------------------------
		int n = 0;
		int n2 = 0;
		int temp = 0;
		for (int i=0;i<=200;i++) { 
			n = (int)(Math.random()*5);
			n2 = (int)(Math.random()*5);
			
			temp = arr[0][0];
			arr[0][0] = arr[n][n2];
			arr[n][n2] = temp;
		}// 랜덤섞기 for문
		//-------------------------------------------
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.printf("%2d\t",arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
