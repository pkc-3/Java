package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/18
 * 이름 : 고현석
 * 내용 : 자바 Switch 조건문 실습하기
 * 
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		String animal = "shark";
		
		switch(animal) {
		
		case "lion":
			System.out.println("animal은 lion입니다.");
			break;
		case "eagle":
			System.out.println("animal은 eagle입니다.");
			break;
		case "tiger":
			System.out.println("animal은 tiger입니다.");
			break;
		default:
			System.out.println("animal은 lion, eagle, tiger가 아닙니다.");
			break;
		}
		//연습문제
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		
		int score = sc.nextInt();
		System.out.println("입력 점수 : "+score);
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A입니다.");
			break;
		case 8:
			System.out.println("B입니다.");
			break;
		case 7:
			System.out.println("C입니다.");
			break;
		case 6:
			System.out.println("D입니다.");
			break;
		default:
			System.out.println("F입니다.");
			break;
		}
	}

}
