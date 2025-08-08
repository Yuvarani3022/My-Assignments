package week3assign2;

public class RemoveDuplicateWords {
	    public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";
	        String[] words = text.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            int count = 0;
	            for (int j = 0; j < words.length; j++) {
	                if (i != j && words[i].equalsIgnoreCase(words[j])) {
	                    count++;
	                    words[j] = ""; // Replace duplicate with empty string
	                }
	            }
	            if (count > 0) {
	                System.out.println("Modified String: " + String.join(" ", words));
	                break; // Exit after finding the first duplicate
	            }
	        }
	    }
	}


