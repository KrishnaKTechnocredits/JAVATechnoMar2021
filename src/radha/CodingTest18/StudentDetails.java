/*
Test - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address
 */
package radha.CodingTest18;

public class StudentDetails implements Comparable<StudentDetails> {
	private int rNo;
	private String firstName;
	private String lastname;
	private String address;
	
	public StudentDetails(int rNo, String firstName, String lastname, String address) {
		super();
		this.rNo = rNo;
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
	}

	@Override
	public int compareTo(StudentDetails student) {
		return this.rNo-student.rNo;
	}
	
	@Override
	public String toString(){
		return " "+rNo+","+firstName+" "+lastname+","+address+"\n";	
	}
}