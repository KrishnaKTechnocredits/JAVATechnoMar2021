package pallavi.coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;

public class StudentInfo implements Comparable<StudentInfo> {

	int rollNo;
	String firstName;
	String lastName;
	String address;

	public StudentInfo(int rollNo, String firstName, String lastName, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public int compareTo(StudentInfo stu) {
		return (int) (this.rollNo - stu.rollNo);
		// return this.rollNo.CompareTo(stu.rollNo);
	}

	@Override
	public String toString() {
		return "StudentInfo [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]\n";
	}

	public static void main(String args[]) {
		ArrayList<StudentInfo> al = new ArrayList<StudentInfo>();
		StudentInfo s1 = new StudentInfo(2, "Raj", "Pallavi", "Patna");
		StudentInfo s2 = new StudentInfo(5, "Kumar", "Anurag", "Meerut");
		StudentInfo s3 = new StudentInfo(10, "Ashwini", "Shukla", "Pune");

		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);
	}

}
