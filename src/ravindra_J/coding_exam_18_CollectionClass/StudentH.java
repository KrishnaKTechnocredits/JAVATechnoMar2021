/*
 Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
 */
package ravindra_J.coding_exam_18_CollectionClass;

public class StudentH {

	private int rollNo;
	private String fName;
	private String lName;
	private String studAddress;
	private String marks;
	public StudentH(int rollNo, String fName, String lName, String studAddress, String marks) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.studAddress = studAddress;
		this.marks = marks;

	}

    @Override
	public int hashCode() {
		return rollNo;

	}
    @Override
	public boolean equals(Object obj) {
    	StudentH stud=(StudentH)obj;
		if(this.rollNo==stud.rollNo && this.fName.equals(stud.fName) ) 
			return true;
		else
			return false;
	}


	@Override
	public String toString() {
		return "StudentH [rollNo=" + rollNo + ", fName=" + fName + ", lName=" + lName + ", studAddress=" + studAddress
				+ ", marks=" + marks + "]";
	}
}

