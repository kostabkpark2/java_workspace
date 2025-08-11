package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class SortLambdaDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(3);
		arr.add(7);

		Collections.sort(arr);

		System.out.println(arr);
		// 내림차순으로 정렬하려면 두번째 매개변수인 Comparator FI 를 구현해야 한다.
		// 숫자끼리 비교이기 때문에 - 연산자를 사용해서 구현했음
		Collections.sort(arr, (o1, o2) -> o2 - o1);
		System.out.println(arr);

		ArrayList<String> sArr = new ArrayList<>();
		sArr.add("c");
		sArr.add("a");
		sArr.add("d");

		Collections.sort(sArr);
		System.out.println(sArr);

		// 내림차순으로 문자열을 정렬하려면 두번째 매개변수인 Comparator FI 를 구현해야 한다.
		// 문자열끼리 비교하려면 ????

		Collections.sort(sArr, (o1, o2) -> o2.compareTo(o1));
		System.out.println(sArr);

		// Line 담고 있는 ArrayList 라면 어떻게 비교하지 ???

	}

}
