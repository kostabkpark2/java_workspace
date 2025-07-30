package ch03;

public class IncrementDemo2 {

	public static void main(String[] args) {
		RefValue ref = new RefValue();
//		ref.x = 10;
		System.out.println("main 에서 increment 호출하기 전 : " + ref.x);
		increment(ref);
		System.out.println("main 에서 increment 호출 후 : " + ref.x);
	}

	public static void increment(RefValue ref) {
		System.out.println("increment 메서드 시작 : " + ref.x);
		ref.x = 1000;
		System.out.println("increment 메서드 종료 : " + ref.x);
	}

}

class RefValue {
	int x;
}