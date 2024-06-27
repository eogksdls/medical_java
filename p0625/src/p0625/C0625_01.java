package p0625;

public class C0625_01 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(); // 기본생성자 호출
		System.out.println("c1 반지름 : "+c1.r);
		System.out.printf("c1 원의 중심 : (%d, %d) \n",c1.center.x,c1.center.y);

//		Point p = new Point(150,150);
//		Circle c2 = new Circle(p,50);
		// 위 객체선언을 한 줄로 호출 가능하다! 
		Circle c2 = new Circle(new Point(150,150),50);
		System.out.println("c2 반지름 : "+c2.r);
		System.out.printf("c2 원의 중심 : (%d, %d) \n",c2.center.x,c2.center.y);
		
		// Shape의 draw 호출하기 -> Circle은 Shape로부터 상속받음
		c2.draw();
		
		int[] a = {1,2,3};
		
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		
		Point[] p = {p1,p2,p3}; // Point[] 안엔 객체가 들어가야한다.
		Triangle t1 = new Triangle(p);
		
		Point[] pp = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t2 = new Triangle(pp);
		
		Triangle t3 = new Triangle(new Point(0,0),new Point(100,100),new Point(50,50));
		
		
		
		
//		// 상속 : 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것
//		Point3D p = new Point3D(); // 객체선언
//		p.x = 100;
//		System.out.println("p.x : "+p.x);
//		
//		Point p2 = new Point();
		
		
	}
}
