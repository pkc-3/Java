package sub1;
/*
 * 날짜 : 2021/05/20
 * 이름 : 고현석
 * 내용 : 자바 메서드(함수) 실습하기
 * 
 */
public class MethodTest {
	
	//main 메서드 : 자바프로그램 시작점
	public static void main(String[] args) {
		//f메서드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		System.out.println("y3 : "+f(3));
		
		//sum 메서드 호출
		System.out.println("1부터 10까지 합 : "+sum(1,10));
		System.out.println("1부터 100까지 합 : "+sum(1,100));
		System.out.println("1부터 1000까지 합 : "+sum(1,1000));
		
	}
	
	// 메서드 정의 : 일련의 코드로직을 모듈화 시킨것 
	//main에 static이 있어서 여기도 static 넣어줘야함 (문법적)
	public static int f(int x) {
		int y = 2 * x +3;
		return y; //return y 값과 f함수 값을 같게 해야해서 int f 선언
	}
	
	public static int sum(int start,int end) {
		int sum = 0;
		
		for(int k=start; k<=end;k++) {
			sum += k;
		}
		
		return sum;
	}
}
