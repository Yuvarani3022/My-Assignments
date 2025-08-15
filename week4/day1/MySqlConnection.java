package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection {
    @Override
    public abstract void connect();
    
    @Override
    public abstract void disconnect();
    
    @Override
    public abstract void executeUpdate();
    
    public abstract void executeQuery();

}


