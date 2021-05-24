package sub1;
/*
 * ��¥ : 2021/05/24
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */
public class Account {
	
	// �Ӽ�(�������) : Ŭ������ ��������� ������ private �������� ĸ��ȭ
	protected String bank; //protected : �ڽ��� �� �� �ְ� ������ private�� �ڽ��� ������ public�� ������ �Ἥ �ȵ�
	protected String id;
	protected String name;
	protected int money;
	
	// ������ : ��������� �ʱ�ȭ�ϱ� ���� �޼���
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���(��� �޼���)
	public void deposit(int money) {
		this.money += money;
	}

	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("=================");
		System.out.println("����� : "+this.bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�Ա��� : "+name);
		System.out.println("�����ܾ� : "+money);
		System.out.println("-----------------");
	}	
}
