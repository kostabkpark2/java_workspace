package ch04.sec07;

import java.util.Scanner;

public class DiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 반복수행할 횟수 입력받기
		Scanner in = new Scanner(System.in);
		System.out.println("반복수행할 횟수를 입력하세요 : ");
		int count = in.nextInt();
		Dice dice = new Dice();
		// 사용자로부터 입력받은 횟수만큼 반복하기
		for (int i = 0; i < count; i++) {
			dice.roll();
		}
		// 사용자로부터 입력받은 횟수만큼 반복하기
	}
}

class Dice {
	void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}
}