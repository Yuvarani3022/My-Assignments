package week4.day1;
import java.util.Arrays;

public class MissingElement {
		    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 10, 6, 8};
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i + 1] - arr[i] > 1) {
	                System.out.println("The missing element is: " + (arr[i] + 1));
	                continue;
	            }
	        }
	    }
	}

