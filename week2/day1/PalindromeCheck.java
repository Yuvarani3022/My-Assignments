package week2.day1;

public class PalindromeCheck {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 121; // first input
		checkPalindrome(input1);
		
		//second input
		int input2 = 12345;
		checkPalindrome(input2);
	}
	public static void checkPalindrome(int input) {
		// you can change the input number
		int original = input;
		// original number
		int reversedNumber = 0;
		
		for (int i = input; i>0; i = i/10 ) {
			int remainder = i % 10;
			reversedNumber = (reversedNumber * 10) + remainder;
		}
		if (original == reversedNumber) {
			System.out.println(original + " is a palindrome");
		} else {
			System.out.println(original + " is NOT a palindrome");
		}
		
	}
}
