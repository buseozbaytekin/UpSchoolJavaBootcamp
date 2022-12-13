package Chapter2.School;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println(getName() + " is studying who is PHD student ");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registered who is PHD student ");
	}

	@Override
	public void writeThesis() {
		System.out.println(getName() + " is writing thesis " + getThesis());
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println(getName() + " is meeting with advisor " + getAdvisor());
	}

	public void writePaper() {
		System.out.println(getMajor() + getName() + "  is writing paper.");
	}

}
