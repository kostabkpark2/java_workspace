package ch05;

public class MutableDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비");

		Cat c2 = c1; // 객체의 주소를 공유

		System.out.println(c1 + ":" + c2);
		System.out.println(c1.getName()); // 나비
		System.out.println(c2.getName()); // 나비

		c2.setName("야옹이");
		System.out.println(c1.getName()); // 나비(X) ==> 야옹이 : side effect
		System.out.println(c2.getName()); // 야옹이

		int i = 1;
		int j = i; // 값 복사

		System.out.println(i + " : " + j);

		j = 3;
		System.out.println(i + " : " + j);

	}

}

class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
