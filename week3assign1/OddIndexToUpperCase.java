package week3assign1;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		System.out.println(String.valueOf(charArray));
	}
}
