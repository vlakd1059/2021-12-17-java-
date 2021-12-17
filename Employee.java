package Exam04;

public abstract class Employee {
	String empno; // 사번
	String name; // 이름
	int pay; // 연봉, 일당
	// 추상클래스의 생성자
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	// getMoneyPay(), print() 추상메소드로 선언
	public abstract int getMoneyPay();

	// public abstract String print();
	public String Print() {
		return empno + " : " + name + " : " + pay;

	}

}
