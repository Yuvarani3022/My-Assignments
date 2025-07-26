package week2.day1;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
//Method to issue a Book
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library lib = new Library();
		String title = lib.addBook("Java Basics");
		System.out.println("Added Book: " + title);
		lib.issueBook();
		// TODO Auto-generated method stub

	}

}
