package ch07;

class Student2 {
	//�ʵ�
	String name;
	int grade;
	String department;
	
	//1�� ������
	Student2(){
		
	}
	
	//2�� ������
	Student2(String n){
		name = n;
	}
	
	//3�� ������
	Student2(String n, int g){
		name = n;
		grade = g;
	}
	
	//4�� ������
	Student2(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
}

public class p171{
	public static void main(String[] args) {
		
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2("ȫ�浿");
		Student2 stu3 = new Student2("ȫ�浿",4);
		Student2 stu4 = new Student2("ȫ�浿",4,"����Ʈ�������");
	}
}