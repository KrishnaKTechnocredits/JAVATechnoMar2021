package technocredits;

public class ConnectionEarly2 {
	private static ConnectionEarly2 con;
	
	static{
		con = new ConnectionEarly2();
	}
	
	private ConnectionEarly2(){
		
	}
	
	public static ConnectionEarly2 getObject() {
		return con;
	}
	
	void insertData() {
		
	}
}
