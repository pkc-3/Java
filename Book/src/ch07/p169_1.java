package ch07;

class Student1 {
	// �ʵ�
	String name;
	int grade;
	String department;
	
	Student1(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	//�⺻������
	Student1(){
		
	}
	
}

public class p169_1{
	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿",4,"����Ʈ���� ����");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student stu2 = new Student("�̼���",3,"������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// �⺻�����ڷ� ��ü ����
		Student1 stu0 = new Student1();
	}
	
}