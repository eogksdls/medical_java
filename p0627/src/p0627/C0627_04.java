package p0627;

public class C0627_04 {

	public static void main(String[] args) {
		try {
			// 예외가 발생할 수 있는 문장을 적음
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e;  //에러발생 -> 예외처리하기
			
			System.out.println(0/0);
			
		}catch (Exception e) {
			// 예외처리를 위한 문장을 적음
			System.out.println("에러메세지 : "+e.getMessage());
			e.printStackTrace();
		}finally {
			//예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣음
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
