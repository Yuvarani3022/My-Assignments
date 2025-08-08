package week3assign1;

public class FindCharacterCount {
	public static void main(String[] args) {
		String input = "TestLeaf";
		char targetChar = 'e';
		int count = 0;

		// Convert the String to a character array
		char[] charArray = input.toCharArray();

		// Iterate through the character array
		for (char c : charArray) {
			// Compare each character with the target character
			if (c == targetChar) {
				// Increment the count if a match is found
				count++;
			}
		}

		// Print the count
		System.out.println("The count of '" + targetChar + "' in the String is: " + count);
	}
}

