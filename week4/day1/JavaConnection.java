package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected to the Database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from the Database");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executed update query successfully");
	}

	public static void main(String[] args) {
		JavaConnection db = new JavaConnection();
		db.connect();
		db.executeUpdate();
		db.disconnect();
	}
}


