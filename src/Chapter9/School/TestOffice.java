package Chapter9.School;

import java.util.Collections;
import java.util.List;

public class TestOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student = registrationOffice.getAStudent();

		registrationOffice.registerStudent((AbstractStudent) student);

		List<AbstractStudent> students = RegistrationOffice.getStudentList();
		Collections.sort(students);
		printStudents(students);

		System.out.println();

	}

	private static void printStudents(List<AbstractStudent> students) {
		System.out.println("\nStudents");
		students.forEach(System.out::println);
	}

}
