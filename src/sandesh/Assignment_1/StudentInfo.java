package sandesh.Assignment_1;

public class StudentInfo {
	
	String name = "Sandesh";
	String middleName = "Raghunath";
	String surname = "Molane";
	String birthdate = "14th Aug 1993";
	String address = "C2-102, Green County Phase 1";
	int rollNo = 34;
	
	void studentName() {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();
		si.studentName();
		si.studentOtherDetails();
	}

}
