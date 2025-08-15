package week4.day1;

public class JavaConnectionExecutor extends MySqlConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to the database...");
    }
    
    @Override
    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }
    
    @Override
    public void executeUpdate() {
        System.out.println("Executing an update query...");
    }
    
    @Override
    public void executeQuery() {
        System.out.println("Executing a query...");
    }
    public static void main(String[] args) {
		JavaConnectionExecutor db = new JavaConnectionExecutor();
		db.connect();
		db.executeUpdate();
		db.disconnect();
    }
}
