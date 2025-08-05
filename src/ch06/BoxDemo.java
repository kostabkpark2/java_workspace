package ch06;

public class BoxDemo {

	public static void main(String[] args) {
		ColoredBox cb = new ColoredBox("빨간색");
		ColoredBox cb1 = new ColoredBox();
		// new Box();
	}

}

class Box {
	public Box() {
		System.out.println("Box 가 생성되었습니다.");
	}

	public Box(String color) {
		System.out.println("Box 가 생성되었습니다.");
	}
}

class ColoredBox extends Box {
	String color;

	public ColoredBox() {
		super();
		System.out.println("ColoredBox 가 생성되었습니다.");
	}

	public ColoredBox(String color) {
//		super(color);
		this.color = color;
		System.out.println(color + " ColoredBox 가 생성되었습니다.");
	}
}