package week4.day1;

import java.util.*;

public class FindIntersection {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3, 2, 11, 4, 6, 7);
		List<Integer> list2 = Arrays.asList(1, 2, 8, 4, 9, 7);

		for (int num : list1) {
			if (list2.contains(num)) {
				System.out.println("Common Element: " + num);
			}
		}
	}
}

