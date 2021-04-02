package ashwini;

public class Details {
	int id;
	String name;
	
	void setDetails(int idNumber, String name1) {
		id = idNumber;
		name = name1;
	}
	
	void getDetails() {
		System.out.println(id);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		Details details = new Details();
		details.setDetails(01,"Ashwini");
		details.getDetails();

	}

}
