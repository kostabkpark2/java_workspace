package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.print("정수 값을 입력하세요 : ");
//		int x = in.nextInt();
//		System.out.printf("당신이 입력한 값은 %d 입니다. \n", x);
//
//		System.out.print("실수 값을 입력하세요 : ");
//		float f = in.nextFloat();
//		System.out.printf("당신이 입력한 값은 %f 입니다.\n", f);

		System.out.print("정수 값을 입력하세요 : ");
		String s = in.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다.\n", s);
		int number = Integer.parseInt(s);
		System.out.printf("s + 10 은 %d 입니다. \n", number + 10);

		System.out.print("실수 값을 입력하세요 : ");
		s = in.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다.\n", s);
		double number1 = Double.parseDouble(s);
		System.out.printf("s + 10 은 %f 입니다. \n", number1 + 10);
	}

}
