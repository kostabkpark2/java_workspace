package ch10.exercise;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		String msg = """
				-------------------------------------------------
				1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				-------------------------------------------------
				선택>
				""";

		Scanner in = new Scanner(System.in);
		String menu = "";
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히 가세요~");
				break;
			}
			switch (menu) {
			case "1" -> System.out.println("계좌를 생성합니다.");
			case "2" -> System.out.println("계좌목록을 출력합니다.");
			case "3" -> System.out.println("예금 처리 중");
			case "4" -> System.out.println("출금 처리 중");
			default -> System.out.println("메뉴 번호를 확인하세요");
			}
		}

	}

}
