package Chapter9.ComparatorSchool;

import java.util.Comparator;

public class StudentComparator implements Comparator<AbstractStudent> {

	@Override
	public int compare(AbstractStudent s1, AbstractStudent s2) {

		return s1.getYear() - s2.getYear();
	}

}
