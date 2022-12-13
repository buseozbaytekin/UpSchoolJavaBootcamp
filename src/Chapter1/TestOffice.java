package Chapter1;

public class TestOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student = registrationOffice.getAStudent();

		registrationOffice.registerStudent(student);


	}

}
