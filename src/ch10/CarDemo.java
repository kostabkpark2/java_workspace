package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0, 3);
		System.out.println(list.size());
		Car[] cars = list.toArray(new Car[3]);

		Comparator<Car> modelComparator = Comparator.comparing(c -> c.getModel());

		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> modelComparator2 = Comparator.comparing(c -> c.getMileage());

		Arrays.sort(cars, modelComparator2);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> modelComparator3 = Comparator.comparing(c -> c.getAge());

		Arrays.sort(cars, modelComparator3);
		System.out.println(Arrays.toString(cars));

	}

}
