/*
 Test - 18 : 1st Jun'2021

Program 2: Student -> return unique list of Student.
rno, first, lastname, address
Note : if rno and firstname is same then objects are duplicate
 */

package upasana.coding_exam_18;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UserDefinedClassStudentHashCodeEquals {
	int rno;
	String firstName;
	String lastName;
	String address;

	UserDefinedClassStudentHashCodeEquals(int rno, String firstName, String lastName, String address) {
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
	public int hashCode() {
		return this.rno;
	}

	@Override
	public boolean equals(Object obj) {
		UserDefinedClassStudentHashCodeEquals stud = (UserDefinedClassStudentHashCodeEquals) obj;
		if (this.rno == stud.rno && this.firstName.equals(stud.firstName))
			return true;
		return false;

	}

	public static void main(String[] args) {
		UserDefinedClassStudentHashCodeEquals stud1 = new UserDefinedClassStudentHashCodeEquals(7, "pallavi", "raj",
				"patna");
		UserDefinedClassStudentHashCodeEquals stud2 = new UserDefinedClassStudentHashCodeEquals(2, "sohini", "singh",
				"bangalore");
		UserDefinedClassStudentHashCodeEquals stud3 = new UserDefinedClassStudentHashCodeEquals(2, "sohini", "mitra",
				"kolkata");
		HashSet<UserDefinedClassStudentHashCodeEquals> list = new HashSet<UserDefinedClassStudentHashCodeEquals>();
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);

		System.out.println(list);

	}

}
