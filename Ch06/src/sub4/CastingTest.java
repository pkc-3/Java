package sub4;
/*
 * 날짜 : 2021/05/25
 * 이름 : 고현석
 * 내용 : 자바 캐스팅(형변환) 실습하기
 * 
 * 
 */

import sub3.Animal;
import sub3.Tiger;
import sub3.Eagle;
import sub3.Shark;

public class CastingTest {
	public static void main(String[] args) {
		//캐스팅 (형변환)
		int num1 = 1;
		double num2 = num1;
		int num3 = (int)num2;
//큰 그릇(double)에서 작은그릇(int)으로 갈때 타입 선언 해줘야함
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		System.out.println("num3 :"+num3);
		
		//업캐스팅(큰그릇으로 바꿈) Animal 이 부모
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		//다운캐스팅(작은그릇으로 바꿈)
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		//instanceof
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}
		else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle 입니다.");
		}
		else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark 입니다.");
		}
	}
}
