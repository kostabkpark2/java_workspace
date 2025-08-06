package ch06.exercise;

public class EX_5 {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (Phone phone : phones) {
			if (phone instanceof Smartphone s) {
				s.playGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else if (phone instanceof Phone) {
				phone.talk();
			}
		}
	}

}

class Phone {
	protected String owner;

	// 생성자
	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner + "가 통화중");
	}
}

class Telephone extends Phone {
	private String when;

	// 접근자
	public String getWhen() {
		return when;
	}

	// 생성자
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	void autoAnswering() {
		System.out.println(owner + "가 부재중이니 " + when + "에 전화 요망");
	}
}

class Smartphone extends Telephone {
	private String game;

	// 접근자
	public String getGame() {
		return this.game;
	}

	// 생성자
	public Smartphone(String owner, String game) {
		super(owner, null);
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + "가 " + game + " 게임 중");
	}
}