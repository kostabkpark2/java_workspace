package ch06;

public class Person {
	String name = "사람";

	void whoAmI() {
		System.out.println("나는 사람이다.");
	}
}

class Student extends Person {
	int number = 3;

	void work() {
		System.out.println("나는 공부한다.");
	}
}

class Employee extends Person {
	int salary = 100;

	void work() {
		System.out.println("나는 일한다.");
	}
}

class SportsPlayer extends Person {
	String sports = "축구";

	void work() {
		System.out.println("나는 운동한다.");
	}
}

class Enterainer extends Person {
	String type = "singer";

	void work() {
		System.out.println("나는 노래한다.");
	}
}
