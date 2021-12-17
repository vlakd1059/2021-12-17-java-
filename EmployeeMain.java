package Exam04;

public class EmployeeMain {
	public static void main(String[] agrgs) {
		RegularEmployee regular = new RegularEmployee("201101", "박건하", 4000, 800);
		// 정보 출력
		System.out.println(regular.Print());

		// 월 급여 출력
		System.out.println(regular.getMoneyPay());

		// 계약직
		TempEmployee temp = new TempEmployee("202105", "건하", 3000);
		System.out.println(temp.Print());

		// 알바
		PartTimeEmployee part = new PartTimeEmployee("202106", "국인", 50000, 12);
		System.out.println(part.Print());

		// 매니저
		Manager manager = new Manager("202107", "종인", 5000, 1000);
		System.out.println(manager.Print());

	}
}
