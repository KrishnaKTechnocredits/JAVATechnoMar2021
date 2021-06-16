package aashay.Test_18;

public class StudentRollNo implements Comparable {
	
	int rollNo;
	String fName, lName, address;
	
	StudentRollNo(int rollNo, String fName,String lName,String address ){
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	
	public String toString() {
		return "Student rollNo = "+rollNo+" Name "+fName+" Last Name "+lName+" Address "+address;
	}
	
	public int  compareTo(Object o) {
		StudentRollNo student = (StudentRollNo)o;
		return this.rollNo-student.rollNo;		
	}

}
