package Chapter2.School;

public class TestOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student = registrationOffice.getAStudent();

		registrationOffice.registerStudent(student);


	}

}
