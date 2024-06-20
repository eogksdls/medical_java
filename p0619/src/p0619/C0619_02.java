package p0619;

public class C0619_02 {

	public static void main(String[] args) {
//		// 1-45까지 로또 번호를 생성해서, 랜점으로 섞은 후, 출력하시오
//		// 1. 생성
		int[][] arr = new int[5][5];
		// 1-25까지 번호를 생성한 후 , 랜덤으로 섞고 -> arr 배열에 넣기
		int[] cont = new int[25];
		for (int i=0;i<cont.length;i++) {
			cont[i] = i+1;
		}
		// 랜덤으로 섞기
		int no = 0;
		int temp = 0;
		for (int i=0;i<=200;i++) {
			no = (int)(Math.random()*25); //0-24까지의 랜덤 index 생성
			temp = cont[0];
			cont[0] = cont[no];
			cont[no] = temp;
		}
		
		// arr 배열에 cont 값 넣어주기!
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = cont[(i*5+j)];
			}
		}
		
		// arr배열 출력 [5,5]
		System.out.println("[ RANDOM arr 배열 출력 ]");
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// [5,5] 배열 출력하기!
		System.out.print("[5,5] arr 배열 출력 >> ");
		System.out.print(arr[4][4]);
		
		
		
		
		
		
		
//		int[] ball = new int[45];
//		for (int i=0;i<ball.length;i++) {
//			ball[i] = i+1;
//		}
//		
//		// 2. 랜덤으로 섞기(랜덤 인덱스와 0번 자리를 300번 섞기)
//		int no = 0; //랜덤 index 번호 생상
//		int temp = 0; // 값 저장 역할
//		for (int i=0;i<=300;i++) {
//			no = (int)(Math.random()*45); // 0-44의 index 생성
//			
//			temp = ball[0];
//			ball[0] = ball[no];
//			ball[no] = temp;
//			
//		}
//		
//		// 3. 출력하기
//		System.out.print("랜덤 숫자 : ");
//		for (int i=0;i<6;i++) {
//			System.out.print(ball[i]+"\t");
//		}
//		System.out.println();
	}
}
