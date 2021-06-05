package madhavi_Khasbage.Coding_Exam_18;
/*Program 2: Student -> return unique list of Student.
rno, first, lastname, address
Note : if rno and firstname is same then objects are duplicate.
*/

public class Student1 {
	int rollnum;
	String fname;
	String lname;
	String address;

	public Student1(int rollnum, String fname, String lname, String address) {
		super();
		this.rollnum = rollnum;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	
	@Override
	 public boolean equals(Object obj) {	  
	      Student1 s1 = (Student1) obj;
	      return fname.equals(s1.fname)&& Integer.compare(rollnum, s1.rollnum) == 0;
	   }

	@Override
	public String toString() {
		return "Student [Roll Number=" + rollnum + ", First name=" + fname + ", Last name:" + lname + ", Address="
				+ address + "]\n";
	}

	
}
