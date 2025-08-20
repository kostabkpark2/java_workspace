package ch13;

public class Thread4Demo {

	public static void main(String[] args) {
		// Thread 익명 객체를 작성하고 이를 활용
		new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " thread ==> ");
				System.out.println("안녕");
			}
		}.start();

		System.out.println(Thread.currentThread().getName() + " thread ==> ");
		System.out.println("hello");

	}

}
