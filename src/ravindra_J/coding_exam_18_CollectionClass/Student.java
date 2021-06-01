/*
 test - 18 : 1st Jun'2021
 Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
 */
package ravindra_J.coding_exam_18_CollectionClass;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String fName;
	private String lName;
	private String studAddress;
	private String marks;
	public Student(int rollNo, String fName, String lName, String studAddress, String marks) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
		this.studAddress = studAddress;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollNo + ", fname=" + fName + ", lname=" + lName + ", studaddress=" + studAddress
				+ ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student stud) {
		// TODO Auto-generated method stub
		return this.rollNo-stud.rollNo;
	}
	
	

}
