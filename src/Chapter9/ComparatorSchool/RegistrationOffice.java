package Chapter9.ComparatorSchool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RegistrationOffice {

	RegistrationOffice() {
		super();
	}

	public Student getAStudent() {

		Random random = new Random();
		int i = random.nextInt(5);

		AbstractStudent student = null;
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
		}

		return student;

	}

	public void registerStudent(AbstractStudent student) {

		if (student instanceof PhdStudent) {

			PhdStudent phdStudent = (PhdStudent) student;
			phdStudent.register();
			System.out.println(phdStudent.toString());
			// System.out.println("Student " + phdStudent.getName() + " has registered.");

		} else if (student instanceof MasterStudent) {

			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
			System.out.println(masterStudent.toString());

		} else if (student instanceof GraduateStudent) {

			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
			System.out.println(graduateStudent.toString());

		} else if (student instanceof UndergraduateStudent) {

			UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student;
			undergraduateStudent.register();
			System.out.println(undergraduateStudent.toString());

		} else if (student instanceof VocationalStudent) {

			VocationalStudent vocationalStudent = (VocationalStudent) student;
			vocationalStudent.register();
			System.out.println(vocationalStudent.toString());

		} else {
			System.out.println("Student " + student.getName() + " has registered.");
		}

	}

	public static List<AbstractStudent> getStudentList() {
		List<AbstractStudent> student = new ArrayList<>();
		student.add(new GraduateStudent(11, "Mustafa Bilce", 5, new Date(), "ss"));
		student.add(new MasterStudent(41, "Lara Işıklar", 3, new Date(), "ss"));
		student.add(new GraduateStudent(57, "Sude Sar", 7, new Date(), "ss"));
		student.add(new MasterStudent(231, "Buse Ozbaytekin", 5, new Date(), "ss"));
		student.add(new PhdStudent(1, "Bade Bilce", 4, new Date(), "ss"));
		student.add(new PhdStudent(10, "Yankı Kayhan", 3, new Date(), "ss"));
		student.add(new UndergraduateStudent(94, "Simge Serter", 3, new Date(), "ss"));
		student.add(new VocationalStudent(18, "Mert Ekici", 5, new Date(), "ss"));
		student.add(new VocationalStudent(256, "Ege Fırat", 4, new Date(), "ss"));
		return student;
	}

}
