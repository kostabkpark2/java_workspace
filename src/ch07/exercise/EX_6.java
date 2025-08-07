package ch07.exercise;

public class EX_6 {

	public static void main(String[] args) {
		Worker w = new Worker();
		w.eat();

		Student s = new Student();
		s.eat();
		s.print();

		Human.echo();
	}

}

interface Human {
	void eat();

	default void print() {
		System.out.println("출력합니다.");
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

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

}
