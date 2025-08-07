package ch07.exercise;

public class EX_5 {

	public static void main(String[] args) {
		Controllable[] c = { new TV(false), new Radio(true) };

		for (Controllable controllable : c) {
			controllable.show();
		}

	}

}

abstract class Controller {
	boolean power;

	public Controller(boolean power) {
		this.power = power;
	}

	void show() {
		if (power) {
			System.out.println(getName() + " 가 켜졌습니다.");
		} else {
			System.out.println(getName() + " 가 꺼졌습니다.");
		}
	}

	abstract String getName();
}

class TV extends Controller {

	@Override
	String getName() {
		return "TV";
	}

	public TV(boolean power) {
		super(power);
	}

}

class Radio extends Controller {

	@Override
	String getName() {
		return "Radio";
	}

	public Radio(boolean power) {
		super(power);
	}

}