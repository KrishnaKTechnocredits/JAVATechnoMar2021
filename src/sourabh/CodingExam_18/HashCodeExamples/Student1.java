/*
Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
 */

package sourabh.CodingExam_18.HashCodeExamples;

public class Student1 {
	int strRno;
	String firstName;
	String lastName;
	String address;
	
	public Student1(int strRno, String firstName, String lastName, String address) {
		super();
		this.strRno = strRno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}		
	
/*	@Override
	public String toString() {
		return "Student1 [strRno=" + strRno + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]\n";
	}
*/
	
	@Override
	public int hashCode() {
		return this.strRno;
	}
	
	@Override
	public String toString() {
		return "Student1 [strRno=" + strRno + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		Student1 student1=  (Student1)obj;
		if(this.strRno== student1.strRno && this.firstName.equals(student1.firstName))
			return true;
		return false;
		
	}			

}
