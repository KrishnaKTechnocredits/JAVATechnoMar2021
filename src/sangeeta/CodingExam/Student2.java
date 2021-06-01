package sangeeta.CodingExam;

public class Student2 {
	
	int rNo;
	String fName;
	String lName;
	String address;
	
	Student2(int rollNo, String firstName, String lastName, String studentAddress){
		super();
		this.rNo = rollNo;
		this.fName = firstName;
		this.lName = lastName;
		this.address = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [roll No=" + rNo + ", Student name="+ fName +", Student last name=" + lName + ", Students address=" + address +"]";
	}
	
	@Override
	public int hashCode() {
		return this.rNo;
	}
	@Override
	public boolean equals(Object obj) {
		Student2 std2  = (Student2)obj;
		if(this.rNo == std2.rNo && this.fName.equals(std2.fName))
			return true;
		else
			return false;
	}
}
