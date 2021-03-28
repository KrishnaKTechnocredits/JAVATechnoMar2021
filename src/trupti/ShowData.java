package trupti;

public class ShowData {
	String name;
	void getName(String firstName) {
		name=firstName;
	}
	
	void display() {
		System.out.println("Firstname is "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowData showdata=new ShowData();
		showdata.getName("Trupti");
		showdata.display();
	}
}
