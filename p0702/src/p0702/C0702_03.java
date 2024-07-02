package p0702;

import java.util.Arrays;
import java.util.Collections;

public class C0702_03 {

	public static void main(String[] args) {
		
		String[] strArr1 = {"S0001","S0002","S0003","S0004","S0005","S0006","S0007"};
		
		String a = strArr1[strArr1.length-1].substring(1); //문자열에서 index가 1인 위치부터 가져오기
		int n = Integer.parseInt(a);
		System.out.println(n+1);
		// 8출력
		
		String[] strArr2 = {"S0001","S0003","S0003","S0010","S0021","S0025","S0026"};
		// 27출력
		a = strArr2[strArr2.length-1].substring(1);
		n = Integer.parseInt(a);
		System.out.println(n+1);
		String[] strArr3 = {"S0301","S0003","S0015","S0010","S0021","S0005","S0026"};
		// 302출력
		Arrays.sort(strArr3);
		
		
		
//		int[] arr = {1,5,21,30,2,11,303};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[arr.length-1]);
//		System.out.println(arr[arr.length-1]+1);
//		
//		Integer[] arr2 = {1,5,21,30,2,11,303};
//		Arrays.sort(arr2,Collections.reverseOrder()); // 역순정렬
//		System.out.println(Arrays.toString(arr2));
	}

}
