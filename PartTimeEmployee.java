package Exam04;

public class PartTimeEmployee extends Employee {
	// �ڽ� Ŭ���������� ������ ��ӹ��� �߻�޼ҵ尡 ���� �Ǿ����.

	// String empno; // ���
	// String name; // �̸�
	// int pay; // �ϴ�
	int workDay; // �ϼ�
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		// this.empno = empno;
		// this.name = name;
		// this.pay = pay;
		this.workDay = workDay;
	}

	public int getMoneyPay() {
		return pay * workDay;
	}

	// public String print() {
	// return empno + " : " + name + " : " + pay;
	// }

}
