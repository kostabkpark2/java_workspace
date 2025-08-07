package ch07.exercise;

public class EX_6 {

	public static void main(String[] args) {
		Worker w = new Worker();
		w.eat();

		Student s = new Student(20);
		s.eat();
		s.print();

		Human.echo();
	}

}

interface Human {
	void eat();

	Object 
	default void print() {
		System.out.println("인간입니다.");
	}

	static void echo() {
		System.out.println("야호!");
	}
}

class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}

}

class Student implements Human {
	int age;

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

	public Student(int age) {
		this.age = age;
	}

	@Override
	public void print() {
		System.out.println(age + " 세의 학생입니다.");

	}
}
