package Chapter2.School;

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
		System.out.println(getName() + " is studying who is undergraduate student ");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registered who is undergraduate student ");

	}

}
