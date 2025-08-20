package ch12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		// 문자열을 스트림으로 변환하고, 문자열을 정렬해서 출력하라.
		System.out.println("문자열 정렬");
		Stream.of("d", "e", "a", "c", "b").sorted().forEach(Util::print);
		// 문자열을 스트림으로 변환하고, 문자열을 역정렬해서 출력하라.
		System.out.println("\n문자열 역정렬");
		Stream.of("d", "e", "a", "c", "b").sorted(Comparator.reverseOrder()).forEach(Util::print);

		// 숫자를 스트림으로 변환하고, 숫자를 정렬해서 출력하라.
		System.out.println("\n숫자 정렬");
		Stream.of(3, 5, 1, 7, 9).sorted().forEach(Util::print);

		// 숫자를 스트림으로 변환하고, 숫자를 역정렬해서 출력하라.
//		Stream.of(3, 5, 1, 7, 9).sorted(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2 - o1;
//			}
//		}).forEach(System.out::println);

		System.out.println("\n숫자 역정렬");
		// Stream.of(3, 5, 1, 7, 9).sorted((Integer o1, Integer o2) -> o2 -
		// o1).forEach(Util::print);
		Stream.of(3, 5, 1, 7, 9).sorted((o1, o2) -> o2 - o1).forEach(Util::print);
		System.out.println("\n숫자 역정렬");
		Stream.of(3, 5, 1, 7, 9).sorted(Comparator.reverseOrder()).forEach(Util::print);
		// 국가 이름 순서대로 출력하라
		System.out.println("\n국가 이름순 출력");
		Nation.nations.stream().sorted(Comparator.comparing(s -> s.getName())).forEach(Util::printWithParenthesis);
		System.out.println("\n국가 이름순 출력");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)).forEach(Util::printWithParenthesis);

		// 국가 이름을 역순으로 정렬해서 출력하라. s 를 Object 으로 추론하기 때문에 reversed 를 붙여서 사용할 수 없음
		// 매개변수가 많거나 복잡해지고, 추론이 애매한 경우면 Nation 이라고 타입을 확정해주기 때문에 메서드 참조를 사용할 것
		// 추론이 문제가 될 경우에는 객체의 타입을 명확하게 선언해주면 됨 (주의 !!!!!)
		Nation.nations.stream().sorted(Comparator.comparing((Nation s) -> s.getName()).reversed())
				.forEach(Util::printWithParenthesis);
		System.out.println("\n국가 이름 역순 출력");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName).reversed())
				.forEach(Util::printWithParenthesis);

		// 국가별 GDP Rank 순서대로 출력하라
		System.out.println("\nGdpRank 순 출력");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getGdpRank)).forEach(Util::printWithParenthesis);

		// 국가별 인구순서대로(인구가 작은 나라부터) 출력하라
		System.out.println("\n인구가 적은 순서대로 출력");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation)).forEach(Util::printWithParenthesis);

		// 국가별 인구순서대로(인구가 많은 나라부터) 출력하라(반드시 메서드 참조로 사용할 것)
		System.out.println("\n인구가 많은 순서대로 출력");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation).reversed())
				.forEach(Util::printWithParenthesis);
		System.out.println();
	}

}
