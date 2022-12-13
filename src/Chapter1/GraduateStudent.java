package Chapter1;

import java.util.Date;

public class GraduateStudent extends Student {

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
		System.out.println("Graduate student is studying");
	}

	@Override
	public void register() {
		System.out.println("Graduate student is registered");
	}

	public void writeThesis() {
		System.out.println(getName() + " is writing thesis " + getThesis());
	}

	public void meetWithAdvisor() {
		System.out.println(getName() + " is meeting with advisor " + getAdvisor());
	}

}
