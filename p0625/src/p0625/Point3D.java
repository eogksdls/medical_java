package p0625;

public class Point3D extends Point {
	// int x;
	// int y; 자동 호출(상속)
	// int r; 부모 변수가 모두 자식에게 상속된다.
	int z;
	
	Point3D(){} // 기본생성자
	
	Point3D(int x,int y,int z){
		// 조상의 기본생성자를 만들지 않으면
		// super() 조상생성자 에러발생
		// super(x,y); 매개변수 조상생성자를 직접 입력해야 함.
		
//		super(x,y); 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}
