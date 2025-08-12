package ch10;

public class UseThisDemo {

	public static void main(String[] args) {
		new UseThisDemo().lambda();
	}

	public void lambda() {
		String hi = "Hi!";

		UseThis u = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "UseThisDemo";
			}

		};

		u.use();

		UseThis u2 = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "UseThisDemo";
			}

		};

		u2.use();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UseThisDemo";
	}

}

interface UseThis {
	void use();
}