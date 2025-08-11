package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("");
		list.add("banana");
		list.add("cherry");

		list.forEach((s) -> System.out.println(s)); // Consumer 인터페이스의 구현체를 람다식으로 작성
		list.removeIf((s) -> s.length() == 0);
		list.forEach((s) -> System.out.println(s)); // Consumer 인터페이스의 구현체를 람다식으로 작성
	}

}
