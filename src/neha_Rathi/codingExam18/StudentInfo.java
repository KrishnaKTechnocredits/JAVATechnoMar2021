/*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/
package neha_Rathi.codingExam18;

public class StudentInfo implements Comparable<StudentInfo> {
	int rollNo;
	String fName;
	String lName, address;
	StudentInfo(int rollNo,String fName,String lName,String address ){
		this.rollNo=rollNo;
		this.fName=fName;
		this.lName=lName;
		this.address=address;
	}

	@Override
	public int compareTo(StudentInfo e) {
		return this.rollNo-e.rollNo;
	}
	
	@Override
	public String toString() {
		return ("RollNo: "+rollNo+" FirstName: "+fName+ " LastName: "+lName+" Addresss: "+address);
	}
}
