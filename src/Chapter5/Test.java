package Chapter5;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", 80, "Production");
		e1.printInfo();
		try {
			System.out.println("Maaşı: " + e1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			processSalaryPaidOnBankException(e);
		}
		e1.work();

		System.out.println();

		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		m1.printInfo();
		try {
			System.out.println("Maaşı: " + m1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			processSalaryPaidOnBankException(e);
		}
		m1.work();
//		m1.manage();

		System.out.println();

		Director d1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		d1.printInfo();

		try {
			System.out.println("Maaşı: " + d1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {

			e.getMessage();
			processSalaryPaidOnBankException(e);
		}
		d1.work();
//		d1.makeAStrategicPlan();

	}

	private static void processSalaryPaidOnBankException(SalaryPaidOnBankException ex) {
		System.err.println(ex.getMessage());
	}
}
