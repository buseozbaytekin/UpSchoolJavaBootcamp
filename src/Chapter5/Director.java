package Chapter5;

public class Director extends Manager {
	protected double bonus;

	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("Director is working!");
		manage();
	}

	@Override
	public void manage() {
		System.out.println("Director manages whole company!");
		makeStrategicPlan();
	}

	public void makeStrategicPlan() {
		System.out.println("Director makes a strategic plan for the company!");
	}

	@Override
	public double calculateSalary() throws SalaryPaidOnBankException {
		if ((year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus) > 7000) {
			throw new SalaryPaidOnBankException("You can take your salary on bank only.");
		}
		return year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
	}
}
