package monali.coding_exam_18;

import java.util.Objects;

public class Student_program_2 {

	private int rollNo;
	private String firstName;
	private String lastName;
	private String address;
	
	public Student_program_2(int rollNo, String firstName, String lastName, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	
	public boolean equals(Object obj) {
		Student_program_2 s1 = (Student_program_2) obj;
		if(this.rollNo == s1.rollNo && this.firstName.equals(s1.firstName))
			return true;
		else
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.rollNo;
		
	}
	
	@Override
	public String toString() {
		return "Student_program_2 [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}

}