package Chapter9.contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Person buse = new Person("Buse", "Ozbaytekin", new ArrayList<>(Arrays.asList("111211", "222322")),
				new ArrayList<>(Arrays.asList("Izmir, Turkey", "Izmir, Turkey")));

		Person mustafa = new Person("Mustafa", "Bilce", new ArrayList<>(Arrays.asList("133333", "333333")),
				new ArrayList<>(Arrays.asList("Izmir, Turkey", "Izmir, Turkey")));

		Person doga = new Person("Doga", "Kayhan", new ArrayList<>(Arrays.asList("1144441", "2554322")),
				new ArrayList<>(Arrays.asList("Indiana, USA", "Indiana, USA")));

		Person lara = new Person("Lara", "Isiklar", new ArrayList<>(Arrays.asList("77555", "8364839")),
				new ArrayList<>(Arrays.asList("Izmir, Turkey", "Izmir, Turkey")));

		Person mert = new Person("Mert", "Isiklar", new ArrayList<>(Arrays.asList("77555", "8364839")),
				new ArrayList<>(Arrays.asList("Izmir, Turkey", "Izmir, Turkey")));

		Person bade = new Person("Bade", "Bilce", new ArrayList<>(Arrays.asList("467397", "46386")),
				new ArrayList<>(Arrays.asList("Izmir, Turkey", "Izmir, Turkey")));

		Person eva = new Person("Eva", "Santos", new ArrayList<>(Arrays.asList("546280", "263447")),
				new ArrayList<>(Arrays.asList("Brugge, Belgium", "Brugge, Belgium")));

		TreeSet<Person> people = new TreeSet<>();
		people.add(buse);
		people.add(buse);
		people.add(mustafa);
		people.add(doga);
		people.add(lara);
		people.add(mert);
		people.add(bade);
		people.add(eva);
		people.comparator();

		Iterator<Person> i = people.iterator();
		while (i.hasNext()) {
			Person people1 = (Person) i.next();
			System.out.println(people1.getFirstName() + " " + people1.getLastName() + " " + people1.getNumbers()
					+ people1.getAdresses());
		}

		System.out.println();

		Person.searchPerson("Buse", people);
		Person.searchPerson("546280", people);
		
		people.iterator().forEachRemaining(System.out::println);
		Map<String, Person> map1 = new HashMap<>();
		Map<String, Person> map2 = new HashMap<>();
		Map<List<String>, Person> map3 = new HashMap<>();
		Map<List<Integer>, Person> map4 = new HashMap<>();
		map1.put(buse.getFirstName(), buse);
		map2.put(mustafa.getLastName(), mustafa);
		map3.put(eva.getAdresses(), eva);
		
		
		map1.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
		map2.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
		map3.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
		map4.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
	

	}

}
