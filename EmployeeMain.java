package Exam04;

public class EmployeeMain {
	public static void main(String[] agrgs) {
		RegularEmployee regular = new RegularEmployee("201101", "�ڰ���", 4000, 800);
		// ���� ���
		System.out.println(regular.Print());

		// �� �޿� ���
		System.out.println(regular.getMoneyPay());

		// �����
		TempEmployee temp = new TempEmployee("202105", "����", 3000);
		System.out.println(temp.Print());

		// �˹�
		PartTimeEmployee part = new PartTimeEmployee("202106", "����", 50000, 12);
		System.out.println(part.Print());

		// �Ŵ���
		Manager manager = new Manager("202107", "����", 5000, 1000);
		System.out.println(manager.Print());

	}
}
