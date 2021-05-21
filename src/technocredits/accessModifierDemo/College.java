package technocredits.accessModifierDemo;

public class College {

	private void insertFirstName(String fname) {
		System.out.println(fname);
		//// insert firstName into DB
		////
		////
	}

	private void insertMname(String mname) {
		System.out.println(mname);
		//// insert mName into DB
		////
		////
	}

	private void insertLastName(String lname) {
		System.out.println(lname);
		//// insert lName into DB
		////
		////
	}

	private void insertAddress(String address) {
		System.out.println(address);
		//// insert address into DB
		////
		////
	}

	void doRegistration(String fname, String mname, String lname, String address, double sscG, double hscG) {
		insertFirstName(fname);
		insertMname(mname);
		insertLastName(lname);
		insertAddress(address);
	}
}
