package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 11, 4, 6, 7);

		Collections.sort(numbers); // Ascending order
		int secondLargest = numbers.get(numbers.size() - 2);

		System.out.println("Second Largest Number: " + secondLargest);
	}
}
