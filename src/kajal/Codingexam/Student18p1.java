/*
 Test - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address
 */
package kajal.Codingexam;

public class Student18p1 implements Comparable<Student18p1> {
	private int rno;
	private String fname;
	private String lname;
	private String address;

	Student18p1(int no, String fnm, String lnm, String add) {
		this.rno = no;
		this.fname = fnm;
		this.lname = lnm;
		this.address = add;
	}

	@Override
	public String toString() {
		return rno + "-" + fname + "-" + lname + "-" + address;
	}

	@Override
	public int compareTo(Student18p1 stud) {
		return (this.rno - stud.rno);
	}
}