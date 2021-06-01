package technocredits;

// Lazy Instantiation
public class Connection {
	private static Connection con;
	
	private Connection(){
		// DB connect
	}
	
	public static Connection getObject() {
		if(con == null)
			con = new Connection();
		return con;
	}
	
	void insertData() {
		
	}
	
	void editData() {
		
	}
	
	void deleteData() {
		
	}
	
	String[] selectData() {
		return null;
	}
}
