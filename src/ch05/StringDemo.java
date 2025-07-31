package ch05;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "J";
		String s2 = "C";

		String s3 = new String("J");
		String s4 = "j";

		System.out.println("s1 == s3 : " + (s1 == s3)); // 동일객체 X
		System.out.println("s1.equals(s3) : " + s1.equals(s3)); // 동등 O

		System.out.println("s3.equalsIgnoreCase(s4) : " + s3.equalsIgnoreCase(s4)); // 대소문자구분 안하고 동등, O

		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2)); // 크기 비교
		System.out.println("s2.compareTo(s1) : " + s2.compareTo(s1)); // 크기 비교
		System.out.println("s1.compareToIgnoreCase(s4) : " + s1.compareToIgnoreCase(s4)); // 크기 비교
	}

}
