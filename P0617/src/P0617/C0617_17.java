package P0617;

public class C0617_17 {

	public static void main(String[] args) {
		//랜덤숫자 10개를 생성해서(1-100까지)... 10개의 숫자의 합을 출력하시오
		int sum = 0;
		for (int i=1;i<=10;i++) {
			int ran_num = (int)(Math.random()*100)+1;
			System.out.println(i+"번째 랜덤 숫자 : "+ran_num);
			sum = sum + ran_num;
		}
		System.out.println("랜덤 숫자들의 합 : "+sum);
	}
}
