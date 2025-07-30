package ch04;

public class ClassDiagramEx {
	public static void main(String[] args) {
		Animal1 animal = new Animal1();
		animal.introduce("동물");
	}
}

class Animal1 {
	public int age;
	public String gender;

	public void isMammal() {
	}

	public void introduce(String name) {
		System.out.println("이름이 " + name + "입니다.");
	}
}

class Duck extends Animal1 {
	public String beakColor = "yellow";

	public void swim() {
	}

	public void quak() {
	}
}

class Fish1 extends Animal1 {
	public int sizeInFt;

	public void swim() {
	}
}
