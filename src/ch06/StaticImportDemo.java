package ch06;

import java.util.Arrays;

public class StaticImportDemo {

	public static void main(String[] args) {
		int[] data = { 5, 3, 1, 2 };

		System.out.println(Arrays.toString(data)); // [5,3,1,2]
		Arrays.sort(data);
		System.out.println(Arrays.toString(data)); // [1,2,3,5]
	}

}
