/*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/
package prashant.coding_exam_18;

public class Student implements Comparable<Student> {
	private int stdrno;
	private String stdfirstname;
	private String stdlastname;
	private String stdaddress;

	public Student(int stdrno, String stdfirstname, String stdlastname, String stdaddress) {
		this.stdrno = stdrno;
		this.stdfirstname = stdfirstname;
		this.stdlastname = stdlastname;
		this.stdaddress = stdaddress;
	}

	@Override
	public String toString() {
		return "Student [stdrno=" + stdrno + ", stdfirstname=" + stdfirstname + ", stdlastname=" + stdlastname
				+ ", stdaddress=" + stdaddress + "]";
	}

	@Override
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		return getStdrno() - std.getStdrno();
	}

	public int getStdrno() {
		return stdrno;
	}

	public void setStdrno(int stdrno) {
		this.stdrno = stdrno;
	}

	public String getStdfirstname() {
		return stdfirstname;
	}

	public void setStdfirstname(String stdfirstname) {
		this.stdfirstname = stdfirstname;
	}

	public String getStdlastname() {
		return stdlastname;
	}

	public void setStdlastname(String stdlastname) {
		this.stdlastname = stdlastname;
	}

	public String getStdaddress() {
		return stdaddress;
	}

	public void setStdaddress(String stdaddress) {
		this.stdaddress = stdaddress;
	}
}
