package shivani.Coding_exam_18;

public class StudentInfo2 {
	
	private int rollNo;
	private String fName;
	private String lName;
	private String studAddress;
	
	public StudentInfo2(int rollNo, String fName, String lName, String studAddress) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.studAddress = studAddress;
	

	}
	public int compareTo(StudentInfo2 std) {
		return (this.rollNo - std.rollNo);
	}

    @Override
	public int hashCode() {
		return rollNo;

	}
    @Override
	public boolean equals(Object obj) {
    	StudentInfo2 stud=(StudentInfo2)obj;
		if(this.rollNo==stud.rollNo && this.fName.equals(stud.fName) ) 
			return true;
		else
			return false;
	}


	@Override
	public String toString() {
		return "Student [Roll Number=" + rollNo + ",  name=" + fName + ",  Lastname= " + lName + ", Address="+	studAddress +"\n";
	}

}