package ch11.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EX_7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = "";
		String minName = "";
		int maxScore = 0;
		int minScore = 100;
		double mean = 0.0;
		int total = 0;

		Set<Map.Entry<String, Integer>> entrys = map.entrySet();

		for (Map.Entry<String, Integer> entry : entrys) {
			int currentValue = entry.getValue();
			total += currentValue;
			if (maxScore < currentValue) {
				maxName = entry.getKey();
				maxScore = currentValue;
			}
			if (minScore > currentValue) {
				minName = entry.getKey();
				minScore = currentValue;
			}
		}
		System.out.printf("최고 정수 학생 = %s , 최고 점수 = %d \n", maxName, maxScore);
		System.out.printf("최저 정수 학생 = %s , 최저 점수 = %d \n", minName, minScore);

		mean = (double) total / map.keySet().size();
		System.out.printf("평균 점수 : %.2f \n", mean);
	}

}
