package madhavi_Khasbage.Coding_Exam_18;

/*Test - 18 : 1st Jun'2021
 Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address*/

public class Student implements Comparable<Student> {

	int rollnum;
	String fname;
	String lname;
	String address;

	public Student(int rollnum, String fname, String lname, String address) {
		super();
		this.rollnum = rollnum;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	@Override
	public int compareTo(Student s1) {

		if (this.rollnum - s1.rollnum > 0) {
			return 1;
		}else if (this.rollnum - s1.rollnum < 0) {
			return -1;
		}else {
			return 0;
		}
	}

	
	@Override
	public String toString() {
		return "Student [Roll Number=" + rollnum + ", First name=" + fname + ", Last name:" + lname +", Address=" + address +"]\n";
	}

}
