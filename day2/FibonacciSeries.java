package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8; //Number of terms
		int n1 = 0, n2 = 1;  //first two numbers
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < range; i++) {
			int n3 = n1 + n2; // Next number
		System.out.print(" " + n3);
		n1 = n2; 
		n2 = n3;
		}

	} 

}
