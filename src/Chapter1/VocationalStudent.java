package Chapter1;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);

	}

	@Override
	public void study() {
		System.out.println("Vocational student is studying");
	}

	@Override
	public void register() {
		System.out.println("Vocational student is registered");
	}

	@Override
	public String toString() {
		System.out.println("Graduate student is registered");
		return "Student [no= " + no + ", name= " + name + ", year= " + year + ", major= " + major + "]";
	}
}
