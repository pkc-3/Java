package sub5;
/*
 * 날짜 : 2021/05/26 
 * 이름 : 고현석
 * 내용 : Math Test 실습하기
 */
public class MathTest {
	public static void main(String[] args) {
		
		//Math math = new Math(); 객체 생성할 필요 없음 그냥 쓰면 됨
		
		System.out.println("PI값 :"+Math.PI);
		System.out.println("절대값 :"+Math.abs(-5));
		System.out.println("절대값 :"+Math.abs(-3.14));
		System.out.println("제곱근 :"+Math.sqrt(9));
		System.out.println("올림값 :"+Math.ceil(1.2));
		System.out.println("올림값 :"+Math.ceil(1.8));
		System.out.println("내림값 :"+Math.floor(1.2));
		System.out.println("내림값 :"+Math.floor(1.8));
		System.out.println("반올림값 :"+Math.round(1.2));
		System.out.println("반올림값 :"+Math.round(1.8));
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2);
		
		double num3 = Math.ceil(num2); //소수점 이하 올림 자리수 지정 못함
		System.out.println("num3 : "+num3);
		
		//1~45사이 실습
		double num = Math.ceil(Math.random()*45);
		System.out.println("1 ~ 45 사이 임의의 정수 : "+num);
	}
}
