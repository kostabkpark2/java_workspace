package ch11.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX_2 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		set.add(new Person("나자바", 35));

		Iterator<Person> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person[%s : %d]", name, age);
	}
}
