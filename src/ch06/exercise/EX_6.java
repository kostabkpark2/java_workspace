package ch06.exercise;

public class EX_6 {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}

}

class Vehicle {
	String color;
	int speed;

	// 생성자
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.println(color + "색 , " + speed + " km 속도의 탈 것");
	}
}

class Car extends Vehicle {
	int displacement;
	int gears;

	// 생성자
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	@Override
	void show() {
		System.out.println(color + "색 , " + speed + " km 속도, " + displacement + " cc, " + gears + " 단의 자동차");
	}

}
