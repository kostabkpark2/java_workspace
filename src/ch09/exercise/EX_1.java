package ch09.exercise;

public class EX_1 {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(Integer.valueOf(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("만능이네");
		System.out.println(s.get());

	}

}

class Box<T> {
	private T content;

	public T get() {
		return content;
	}

	public void set(T content) {
		this.content = content;
	}
}