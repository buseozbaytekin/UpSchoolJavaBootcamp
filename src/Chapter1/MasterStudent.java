package Chapter1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		System.out.println("Master student is studying");
	}

	@Override
	public void register() {
		System.out.println("Master student is registered");

	}

	@Override
	public void writeThesis() {
		System.out.println(getName() + " is writing thesis " + getThesis());
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println(getName() + " is meeting with advisor " + getAdvisor());
	}

}
