package aashay.Test_18;

public class StudentDuplicateRollNo {
	
	int rollNo;
	String fName, lName, address;
	
	StudentDuplicateRollNo(int rollNo, String fName,String lName,String address ){
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	
	public int hashCode() {
		return this.rollNo;
	}
	
	public boolean equals(Object o) {
		StudentDuplicateRollNo studentDuplicateRollNo1 = (StudentDuplicateRollNo)o;
		if(this == studentDuplicateRollNo1 || studentDuplicateRollNo1.rollNo == this.rollNo && this.fName.equals(studentDuplicateRollNo1.fName)) 
			return true;
		else
			return false;
	}
	public String toString() {
		return "Student rollNo = "+rollNo+" Name "+fName+" Last Name "+lName+" Address "+address;
	}

}
