package Chapter9.contact;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private List<String> numbers;
	private List<String> adresses;

	public Person(String firstName, String lastName, List<String> numbers, List<String> adresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.numbers = numbers;
		this.adresses = adresses;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public List<String> getAdresses() {
		return adresses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName);
	}

	@Override
	public String toString() {
		return "Person: " + firstName + " " + lastName + " " + numbers + " " + adresses;
	}

	@Override
	public int compareTo(Person o) {
		Person other = (Person) o;
		if (lastName.compareTo(other.lastName) == 0)
			return firstName.compareTo(other.firstName);

		else
			return lastName.compareTo(other.lastName);
	}

	public static void searchPerson(Object o, TreeSet<Person> people) {
		Iterator iterator = people.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			if (person.getFirstName() == o || person.getLastName() == o || person.getNumbers().contains(o)
					|| person.getAdresses().contains(o))
				System.out.println("Searching.. " + person.toString());
		}

	}

}
