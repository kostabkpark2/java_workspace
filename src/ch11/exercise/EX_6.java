package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EX_6 {

	public static void main(String[] args) {
		// 로또 6/45 생성
		Random r = new Random();
		List<Integer> lotto = new ArrayList<>();
		int number = 0;

		while (true) {
			if (lotto.size() >= 6) {
				break;
			}
			number = r.nextInt(1, 46);
			if (lotto.contains(number)) {
				continue;
			} else {
				lotto.add(number);
			}
		}
		Collections.sort(lotto);
		System.out.println(lotto);
	}

}
