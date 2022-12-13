package Chapter1;

import java.util.Date;

public class UndergraduateStudent extends Student {
	String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Override
	public void study() {
		System.out.println("Undergraduate student is studying");
	}

	@Override
	public void register() {
		System.out.println("Undergraduate student is registered");

	}

	@Override
	public String toString() {
		System.out.println("Graduate student is registered");
		return "Student [no= " + no + ", name= " + name + ", year= " + year + ", major= " + major + "]";
	}
}
