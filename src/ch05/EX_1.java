package ch05;

public class EX_1 {

	public static void main(String[] args) {
		System.out.println(countChar("hello", 'L'));
		System.out.println(countChar("hello", 'l'));
	}

	public static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.toUpperCase().charAt(i) == c || s.toLowerCase().charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
