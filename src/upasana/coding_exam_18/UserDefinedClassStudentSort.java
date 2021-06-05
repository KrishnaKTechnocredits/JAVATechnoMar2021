/*
 Test - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address
 */

package upasana.coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;

public class UserDefinedClassStudentSort implements Comparable<UserDefinedClassStudentSort> {
	int rno;
	String firstName;
	String lastName;
	String address;

	UserDefinedClassStudentSort(int rno, String firstName, String lastName, String address) {
		this.rno = rno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return " [Student --> rno : " + rno + " firstName : " + firstName + " lastName : " + lastName + " address : "
				+ address + "]\n";

	}

	@Override
	public int compareTo(UserDefinedClassStudentSort obj) {

		if (this.rno > obj.rno)
			return 1;
		else if (this.rno < obj.rno)
			return -1;
		else
			return 0;

	}

	public static void main(String[] args) {
		UserDefinedClassStudentSort stud1 = new UserDefinedClassStudentSort(7, "pallavi", "raj", "patna");
		UserDefinedClassStudentSort stud2 = new UserDefinedClassStudentSort(2, "simmi", "singh", "bangalore");
		UserDefinedClassStudentSort stud3 = new UserDefinedClassStudentSort(76, "sohini", "mitra", "kolkata");
		ArrayList<UserDefinedClassStudentSort> list = new ArrayList<UserDefinedClassStudentSort>();
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);

		Collections.sort(list);
		System.out.println(list);

	}

}
