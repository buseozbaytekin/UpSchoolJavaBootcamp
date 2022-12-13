package Chapter1;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

	RegistrationOffice() {
		super();
	}

	public Student getAStudent() {

		Random random = new Random();
		int i = random.nextInt(6);

		Student student = null;
		switch (i) {
		case 0:
			student = new MasterStudent(1, "Buse", 2020, new Date(), "Economics");
			break;
		case 1:
			student = new PhdStudent(2, "Mustafa", 2019, new Date(), "Computer Engineering");
			break;
		case 2:
			student = new GraduateStudent(3, "Ayşe", 2021, new Date(), "Psychology");
			break;
		case 3:
			student = new UndergraduateStudent(4, "Mehmet", 2022, new Date(), "Economics");
			break;
		case 4:
			student = new VocationalStudent(5, "Ayfer", 2018, new Date(), "Computer Engineering");
			break;
		case 5:
			student = new Student(6, "Selin", 2017, new Date(), "Software Engineering");
			break;
		}

		return student;

	}

	public void registerStudent(Student student) {

		if (student instanceof PhdStudent) {

			PhdStudent phdStudent = (PhdStudent) student;
			phdStudent.register();
			System.out.println("Student " + phdStudent.getName() + " has registered.");

		} else if (student instanceof MasterStudent) {

			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();

		} else if (student instanceof GraduateStudent) {

			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();

		} else if (student instanceof UndergraduateStudent) {

			UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student;
			undergraduateStudent.register();

		} else if (student instanceof VocationalStudent) {

			VocationalStudent vocationalStudent = (VocationalStudent) student;
			vocationalStudent.register();

		} else {
			System.out.println("Student " + student.getName() + " has registered.");
		}

	}

}
