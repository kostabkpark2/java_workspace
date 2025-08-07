package ch07.exercise;

import java.util.Arrays;

public class EX_3_4 {

	public static void main(String[] args) {
		Person[] persons = { new Person("손흥민", 20, 180, 70), new Person("홍길동", 32, 170, 75),
				new Person("박지성", 40, 175, 68) };

		System.out.println("정렬전");
		for (Person person : persons) {
			System.out.println(person);
		}

		Arrays.sort(persons);

		System.out.println("나이 기준 내림차순 정렬 후");
		for (Person person : persons) {
			System.out.println(person);
		}

	}

}

class Person implements Comparable {
	String name;
	int age;
	int height;
	int weight;

	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Person p) {
			// return this.age - p.age; // 오름차순으로 정렬할 때의 리턴값
			// return (this.age - p.age) * -1; // 내림차순으로 정렬하기 위해 리턴값을 반대로 뒤집음
			return p.age - this.age; // 내림차순으로 정렬하기 위해 리턴값을 반대로 뒤집음
		}
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person [이름 = %s, 나이 = %d, 키 = %d, 몸무게 = %d]", name, age, height, weight);
	}
}