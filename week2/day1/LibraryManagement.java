package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of library class
		Library lib = new Library();
		
		//call both methods
		String addedBook = lib.addBook("Data Structures");
		System.out.println("Book Title Returned: " + addedBook);
		lib.issueBook();
		
	}

}
