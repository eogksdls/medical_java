package p0626;

import java.util.ArrayList;

public class C0626_04 {

	public static void main(String[] args) {
		// C20240001, C20240002,.....
		// 1:white,4 2:red,5 3:blue,4, 4:gray,3 5:black,5
		
		ArrayList list = new ArrayList();
		// Car 객체 입력
		list.add(new Car("white",4));
		list.add(new Car("red",5));
		list.add(new Car("blue",4));
		list.add(new Car("gray",3));
		list.add(new Car("black",5));
		
		System.out.println("입력된 개수 : "+list.size());
		
		// 전체출력
		System.out.println();
		System.out.printf("%s   %s\t%s \n","SerialNo","Color","Door");
		System.out.println("-------------------------------");
		for (int i=0;i<list.size();i++) {
			Car c = (Car) list.get(i);
			System.out.printf("%s   %s  \t%d \n",
					c.serialNo,c.color,c.door);
		}
	}

}
