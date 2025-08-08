package week3assign2;

public class ReverseOddWords {
	    public static void main(String[] args) {
	        String input = "i am a software tester";
	        String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 != 0) {
	                // Reverse the word at odd index
	                StringBuilder reversedWord = new StringBuilder(words[i]);
	                result.append(reversedWord.reverse().toString());
	            } else {
	                result.append(words[i]);
	            }
	            if (i < words.length - 1) {
	                result.append(" ");
	            }
	        }

	        System.out.println(result.toString());
	    }
	}

