package sub2;
/*
 * 날짜 : 2021/05/17
 * 이름 : 고현석
 * 내용 : 자바 변수의 자료형 실습하기
 * 
 * 
 */
public class DataTypeTest {
	public static void main(String[] args) {
		
		//정수형
		byte num1 = 127; //byte는 127까지만 저장가능 8bit = 1byte
		short num2 = 32767;//short는 32767까지만 저장가능 16bit = 2byte
		int num3 = 2147483647;//int는 2147483647까지만 저장가능 32bit = 4byte
		long num4 = 1000L;//int 범위 벗어날때 L을 붙여준다 long이 저장 공간 제일큼 64bit = 8byte
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		//실수형
		float var1 = 1.123456789f; 			 //소수점 7자리까지 저장
		double var2 = 1.1234567890123456789; //소수점 16자리까지 저장(더 정밀함)
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		
		//논리형
		boolean value1 = true; //python에선 첫글자 대문자지만 java에선 소문자
		boolean value2 = false;
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		
		//문자형
		char ch1 = 'A'; //하나만 저장가능 단어는 안됨 '' 작은 따옴표
		char ch2 = '가';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		//문자열
		String str1 = "Apple"; // 단어 저장 ""큰 따옴표 python과 달리 구분함 
		String str2 = "가위";  //문자열을 자주 사용함
		String str3 = "A"; 
		String str4 = "가"; 
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		
		
		
	}

}
//ctrl + alt + 방향키 밑 (한줄복사)
//ctrl + d 한줄 지우기