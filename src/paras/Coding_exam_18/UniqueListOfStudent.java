/*
Program 2: Student -> return unique list of Student.
rno, first, lastname, address
Note : if rno and firstname is same then objects are duplicate.
 */
package paras.Coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UniqueListOfStudent {
	
	int rNo;
	String firstName;
	String lastName;
	String address;
	
	public UniqueListOfStudent(int rNo, String firstName, String lastName, String address) {
		this.rNo = rNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public boolean equals(Object obj) {
		UniqueListOfStudent s1 = (UniqueListOfStudent) obj;
		if (this.rNo == s1.rNo && this.firstName.equals(s1.firstName))
			return true;
		else
			return false;
	}

	public int hashCode() {
		return this.rNo;

	}
	
	@Override
	public String toString() {
		return "UniqueListOfStudent[rNo="+rNo+",firstName="+firstName+",lastName"+lastName+",address="+address+"]";
	}
	
	public static void main(String[] args) {
		HashSet<UniqueListOfStudent> uniqueStudent = new HashSet<UniqueListOfStudent>();
		UniqueListOfStudent Student1 = new UniqueListOfStudent(5, "Akshay", "Rokad", "Rajkot");
		UniqueListOfStudent Student2 = new UniqueListOfStudent(1, "Paras", "Rokad", "Rajkot");
		UniqueListOfStudent Student3 = new UniqueListOfStudent(8, "Kishan", "Patel", "Ahmedabad");
		UniqueListOfStudent Student4 = new UniqueListOfStudent(8, "Akshay", "Rokad", "Rajkot");
		
		uniqueStudent.add(Student1);
		uniqueStudent.add(Student2);
		uniqueStudent.add(Student3);
		uniqueStudent.add(Student4);
		System.out.println(uniqueStudent);
	}
	
}