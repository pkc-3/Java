package ch07;

class Student2 {
	//필드
	String name;
	int grade;
	String department;
	
	//1번 생성자
	Student2(){
		
	}
	
	//2번 생성자
	Student2(String n){
		name = n;
	}
	
	//3번 생성자
	Student2(String n, int g){
		name = n;
		grade = g;
	}
	
	//4번 생성자
	Student2(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
}

public class p171{
	public static void main(String[] args) {
		
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2("홍길동");
		Student2 stu3 = new Student2("홍길동",4);
		Student2 stu4 = new Student2("홍길동",4,"소프트웨어공학");
	}
}