package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 13; // Example number
		boolean isprime = true;
		// 0 and 1 are not prime numbers
		if ( num <= 1) {
			isprime = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
		}
		//print result
		if (isprime)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is Not prime");
	
	}

}
