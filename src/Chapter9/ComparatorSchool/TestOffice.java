package Chapter9.ComparatorSchool;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student = registrationOffice.getAStudent();

		registrationOffice.registerStudent((AbstractStudent) student);

		comparatorStudent();

	}

	private static void comparatorStudent() {

		List<AbstractStudent> student = RegistrationOffice.getStudentList();
		printStudents(student); // Before sorting
		Comparator<AbstractStudent> comparator1 = (o1, o2) -> o1.name.compareTo(o2.name);
		Collections.sort(student, comparator1);
		printStudents(student);
	}

	private static void printStudents(List<AbstractStudent> students) {
		System.out.println("\nStudents");
		students.forEach(System.out::println);
	}

}
