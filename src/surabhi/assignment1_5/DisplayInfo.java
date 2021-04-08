package surabhi.assignment1_5;

public class DisplayInfo {
	String studentName;
	
	void studentName(String name){
		studentName=name;
	}
	
	void display() {
		System.out.println("Name is " +studentName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayInfo displayInfo=new DisplayInfo();
		displayInfo.studentName("Surabhi");
		displayInfo.display();
	}

}
