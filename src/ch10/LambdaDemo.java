package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
//		(a, b) -> a > b ? a : b;

//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
//
//		int value = obj.max(2, 3);

//		MyFunction f = new MyFunction() {
//			@Override
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			};
//		};

		MyFunction f = (a, b) -> a > b ? a : b;

		int value = f.max(3, 5);
		System.out.println(value);

		PrintFunction pf = (name, i) -> System.out.println(name + "=" + i);

		pf.printVar("hello", 3);

		SquareFunction sf = (int x) -> x * x;

		System.out.println(sf.square(3));

		RollFunction rf = new RollFunction() {

			@Override
			public int roll() {
				// TODO Auto-generated method stub
				return (int) (Math.random() * 6) + 1;
			}

		};

		for (int i = 0; i < 10; i++) {
			System.out.println(rf.roll());
		}

	}

}

@FunctionalInterface
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int i);
}

@FunctionalInterface
interface SquareFunction {
	int square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

//class MyClass implements MyFunction {
//
//	@Override
//	public int max(int a, int b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}
