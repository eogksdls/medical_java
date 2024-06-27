package p0624;

import java.util.Arrays;

public class C0624_07 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int[] result = new int[4];
		String[] title = {"더하기","빼기","곱하기","나누기"};
		//Element의 메소드를 활용해서
		// a,b의 사칙연산 결과값을 출력하시오.
		// cal(a,b);
		
		// 더하기 : 15;
		
		Element e = new Element();
		e.allCal(a, b,result);
		
		for (int i=0;i<title.length;i++) {
			System.out.printf("%s : %d \n",title[i],result[i]);
		}
		
	}
}
