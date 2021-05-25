package ch07;

class Student1 {
	// 필드
	String name;
	int grade;
	String department;
	
	Student1(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	//기본생성자
	Student1(){
		
	}
	
}

public class p169_1{
	public static void main(String[] args) {
		Student stu = new Student("홍길동",4,"소프트웨어 공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student stu2 = new Student("이순신",3,"디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// 기본생성자로 객체 생성
		Student1 stu0 = new Student1();
	}
	
}