/*/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package neha_Rathi.codingExam18;

public class StudentDetails {
	int rNo;
	String firstname,lastname,address;
	
	StudentDetails(int rNo,String firstname, String lastname,String address){
		this.rNo=rNo;
		this.firstname=firstname;
		this.lastname= lastname;
		this.address=address;
	}
	
	@Override
	public boolean equals(Object obj){
		StudentDetails s1 = (StudentDetails) obj;
		if(this.rNo==s1.rNo && this.firstname==s1.firstname)
		return true;
		return false;
	}
	@Override 
	public int hashCode() {
		return firstname.hashCode();
	}
}

