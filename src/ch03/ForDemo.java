package ch03;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {

		// for ( 초기식 ; 조건식 ; 증감식 ) {
		for (int i = 0; i < 5; i++) { // i ++ ==> i += 1 ==> i = i + 1
			System.out.println("hello world , " + (i + 1));
		}

		// 11 부터 20 까지 정수를 출력
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		// ...(생략)...
//		System.out.println("2 * 9 = 18");

		// scanner 를 선언한다.
		Scanner in = new Scanner(System.in);
		// 구구단을 입력하라는 출력문을 실행한다.
		System.out.println("출력하고자 하는 구구단 을 입력하세요 : (2 ~ 19) ");
		// 몇 단을 출력하고 싶은지 입력 받는다.
		int dan = in.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}
//		// 구구단 2단을 반복문으로 출력
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d \n", 2, i, 2 * i);
//		}
//
//		// 구구단 3단을 반복문으로 출력
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d \n", 3, i, 3 * i);
//		}

	}

}
