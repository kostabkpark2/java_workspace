package ch10.exercise;

import java.util.Scanner;

public class BankApplication {
	// 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다.
	// 계좌번호는 유일해야 함.
	// - 비밀번호는 숫자 4자리로만 입력해야 함.(Optional)
	// 2. 예금은 금액 제한 없음
	// 입금시 계좌번호만 알면 입금할 수 있음
	// 3. 잔고보다 큰 금액은 인출할 수 없음 (마이너스 통장 X)
	// 출금시 계좌번호와 비밀번호가 일치해야만 인출할 수 있음(Optional)
	// 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변경할 수 없음
	// 비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는 경우에만 변경할 수 있음(Optional)

	public static void main(String[] args) {
		String msg = """
				-------------------------------------------------
				1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				-------------------------------------------------
				선택>
				""";
		String msg1 = """
				-------
				계좌생성
				-------""";
		String msg2 = """
				-------
				계좌목록
				-------""";

		Scanner in = new Scanner(System.in);
		Account[] accounts = new Account[100];
		int index = 0;
		String menu = "";
		String accountNo = "";
		String accountOwner = "";
		long balance = 0;
		String password = "";
		String password1 = "";
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히 가세요~");
				break;
			}
			switch (menu) {
			case "1" -> {
				System.out.println(msg1);
				System.out.print("계좌번호 : ");
				accountNo = in.nextLine();
				System.out.print("계좌주 : ");
				accountOwner = in.nextLine();
				System.out.print("비밀번호 : ");
				password = in.nextLine();
				System.out.print("비밀번호 (재입력) : ");
				password1 = in.nextLine();
				System.out.print("초기 입금액 : ");
				balance = Long.parseLong(in.nextLine());
				// 계좌번호가 유일한지 체크 추가 ??? 어떻게 하는게 더 효율적인지 생각해보기
				if (isDuplicated(accounts, index, accountNo)) {// 계좌번호 중복
					System.out.println("계좌번호가 중복되어 계좌 생성을 할 수 없습니다ㅣ 다시 입력하세요");
				} else if (accountNo.isBlank() || accountOwner.isBlank() || !password.equals(password1)
						|| balance <= 0) {
					System.out.println("계좌 생성을 위한 필수값이 입력되지 않았거나 비밀번호가 서로 다릅니다. 다시 입력하세요");
				} else {
					if (index <= 99) {
						accounts[index] = new Account(accountNo, accountOwner, password, balance);
						System.out.println("계좌가 생성되었습니다.");
						index++;
					} else {
						System.out.println("더 이상 계좌를 생성할 수 없습니다. 관리자에게 연락하세요.");
					}
				}
			}
			case "2" -> {
				System.out.println(msg2);
				for (int i = 0; i < index; i++) {
					System.out.println(accounts[i]);
				}
			}
			case "3" -> {
				System.out.println("예금 처리 중");
			}
			case "4" -> {
				System.out.println("출금 처리 중");
			}
			default -> System.out.println("메뉴 번호를 확인하세요");
			}
		}

	}

	private static boolean isDuplicated(Account[] arr, int size, String accountNo) {
		for (int i = 0; i < size; i++) {
			if (arr[i].getAccountNo().equals(accountNo)) {
				return true;
			}
		}
		return false;
	}
}
