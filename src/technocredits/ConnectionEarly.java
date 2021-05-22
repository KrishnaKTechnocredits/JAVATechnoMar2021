package technocredits;

public class ConnectionEarly {
	private static ConnectionEarly con = new ConnectionEarly();
	
	private ConnectionEarly(){
		
	}
	
	public static ConnectionEarly getObject() {
		return con;
	}
	
	void insertData() {
		
	}
}
