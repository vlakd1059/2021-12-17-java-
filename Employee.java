package Exam04;

public abstract class Employee {
	String empno; // ���
	String name; // �̸�
	int pay; // ����, �ϴ�
	// �߻�Ŭ������ ������
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	// getMoneyPay(), print() �߻�޼ҵ�� ����
	public abstract int getMoneyPay();

	// public abstract String print();
	public String Print() {
		return empno + " : " + name + " : " + pay;

	}

}
