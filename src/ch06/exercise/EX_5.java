package ch06.exercise;

public class EX_5 {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (Phone phone : phones) {
			if (phone instanceof Smartphone s) {
				s.playGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else {
				phone.talk();
			}
		}
	}

}

class Phone {
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner + "가 통화중");
	}
}

class Telephone extends Phone {
	private String when;

	public String getWhen() {
		return this.when;
	}

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

	public String getGame() {
		return game;
	}

	public Smartphone(String owner, String game) {
		super(owner, null);
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + "가 " + game + " 게임 중");
	}
}