package Exam04;

public class TempEmployee extends Employee {
	// String empno; // ���
	// String name; // �̸�
	// int pay; // ����
	

	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
		// this.empno = empno;
		// this.name = name;
		// this.pay = pay;
	}

	public int getMoneyPay() {
		return pay / 12;
	}

	// public String print() {
	// return empno + " : " + name + " : " + pay;
	// }

}
