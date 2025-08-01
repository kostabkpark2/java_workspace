package ch03;

import java.util.Scanner;

public class EX_7 {

	public static void main(String[] args) {
		// while 문과 Scanner 의 nextLine() 메서드를 이용해서 다음 실행 결과와 같이
		// 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보시오.
		// 단, 출금은 잔고보다 큰 금액은 할 수 없다.(잔고는 -가 될 수 없다.)
		// ------------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ------------------------------------
		// 선택> 1
		// 예금액> 10000
		// ------------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ------------------------------------
		// 선택> 2
		// 출금액> 2000
		// ------------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ------------------------------------
		// 선택> 3
		// 잔고> 8000
		// ------------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ------------------------------------
		// 선택> 4
		// 프로그램 종료

		Scanner in = new Scanner(System.in);
		String msg = """
				------------------------------------
				1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
				------------------------------------
				선택 > """;
		String menu = "";
		long balance = 0;
		long money = 0;
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("4")) {
				break;
			} else if (menu.equals("3")) {
				System.out.println("잔고 > " + balance);
			} else if (menu.equals("2")) {
				System.out.println("출금액> ");
				money = Long.parseLong(in.nextLine());
				if (balance >= money) {
					balance -= money;
				} else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu.equals("1")) {
				System.out.println("예금액> ");
				money = Long.parseLong(in.nextLine());
				balance += money;
			} else {
				System.out.println("메뉴 번호 확인하세요");
			}
		}
		System.out.println("프로그램 종료 !!");
	}

}
