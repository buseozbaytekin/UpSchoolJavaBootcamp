package Chapter3.School;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {

	String advisor;
	String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);

	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	@Override
	public void study() {
		System.out.println(getName() + " is studying who is graduate student ");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registered who is graduate student ");
	}

	public void writeThesis() {
		System.out.println(getName() + " is writing thesis " + getThesis());
	}

	public void meetWithAdvisor() {
		System.out.println(getName() + " is meeting with advisor " + getAdvisor());
	}

}
