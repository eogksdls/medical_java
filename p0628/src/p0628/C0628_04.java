package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾고자 하는 문자열을 입력하세요.>> ");
		String search = scan.next();
		
		String str = "abcdefaghiakdjdnd";
		System.out.println("해당 문자열 : "+str);
		int count = 0;
		while(true) {
			int num = 0;
			num = str.indexOf(search);
			if(num == -1) {
				break; //해당하는 문자열을 못찾을 때 -1 리턴
			}else {
				count++;
				str = str.substring(num+1);
			}
		}
		System.out.printf("%s 찾는 문자열 개수 : %d \n",search,count);
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(str.indexOf("a")); //맨 처음 나온 index의 위치값만 반환
//		System.out.println(str.substring(1));
//		
//		String str2 = str.substring(1); // a가 나온 index 값 뒤로 새로운 문자열 할당
//		System.out.println(str2.indexOf("a"));
//		
//		String str3 = str2.substring(5);
//		System.out.println(str3);
//		System.out.println(str3.indexOf("a"));
//		
//		String str4 = str3.substring(1);
//		System.out.println(str4);
//		System.out.println(str4.indexOf("a"));
		
	}

}
