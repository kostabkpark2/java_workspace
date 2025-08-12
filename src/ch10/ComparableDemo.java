package ch10;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		RectAngle[] rectAngles = { new RectAngle(3, 5), new RectAngle(2, 10), new RectAngle(5, 7) };

		Arrays.sort(rectAngles); // compareTo 의 기본 정렬 방식으로 정렬됨, ascending 방식 정렬
//		Arrays.sort(rectAngles, new Comparator<RectAngle>() {
//			@Override
//			public int compare(RectAngle o1, RectAngle o2) {
//				return o1.height - o2.height;
//			};
//		}); // compareTo 의 기본 정렬 방식이 아닌 다른 기준으로 정렬 ==> 높이가 더 큰 것이 앞으로 오도록 정렬

		Arrays.sort(rectAngles, (o1, o2) -> o1.height - o2.height);

		// compareTo 의 기본 정렬 방식이 아닌 다른 기준으로 정렬 ==> 높이가 더 큰 것이 앞으로 오도록 정렬
		System.out.println(Arrays.toString(rectAngles));

	}

}

class RectAngle implements Comparable<RectAngle> {
	int width, height;

	public RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	@Override
	public int compareTo(RectAngle o) {
		return this.findArea() - o.findArea();
	}
}