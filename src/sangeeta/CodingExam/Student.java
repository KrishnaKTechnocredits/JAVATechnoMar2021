package sangeeta.CodingExam;

public class Student implements Comparable<Student>{
	
	int rNo;
	String fName;
	String lName;
	String address;
	
	Student(int rollNo, String firstName, String lastName, String studentAddress){
		this.rNo = rollNo;
		this.fName = firstName;
		this.lName = lastName;
		this.address = studentAddress;
	}
	
	public String toString() {
		return "Student [roll No = " + rNo + ", Student name = "+ fName +", Student last name = " + lName + ", Students address = " + address +"]";
	}
	
	public int compareTo(Student std) {
		return (this.rNo - std.rNo);
	}

}
