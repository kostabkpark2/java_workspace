package ch05.exercise;

import java.util.Arrays;

public class EX_5 {
	public static void main(String[] args) {
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;

		for (int i = 0; i < interests.length; i++) {
			System.out.println(Arrays.toString(interests[i])); // 1차원배열 내용 확인
			for (int j = 0; j < interests[i].length; j++) {
				System.out.println(interests[i][j]); // 2차원배열 내용 확인
				sum1[i] += interests[i][j];
			}
			System.out.println((i + 1) + " 번째 년도 이자율 합 : " + sum1[i]);
			sum2 += sum1[i];
		}

		System.out.println(sum2);

	}
}
