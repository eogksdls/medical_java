package p0619;

public class C0619_03 {
	public static void main(String[] args) {
		
		// [5][5] 배열에서 랜덤으로 섞기
		int[][] arr = new int[5][5];
		// 1. 1-25까지 번호를 생성한 대입
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = i*5 + (j+1); 
			}
		}
		// 2. 랜덤 섞기
		int no1 = 0;
		int no2 = 0;
		int temp = 0;
		for (int i=0;i<=200;i++) {
			no1 = (int)(Math.random()*5); // 0-4
			no2 = (int)(Math.random()*5); // 0-4
			temp = arr[0][0];
			arr[0][0] = arr[no1][no2];
			arr[no1][no2] = temp;
		}
		
		// 3. 출력
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t"); 
			}
			System.out.println();
		}
	}
}
