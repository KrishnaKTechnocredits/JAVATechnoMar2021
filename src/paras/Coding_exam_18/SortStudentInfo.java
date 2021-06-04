/*
Coding_Exam_18

Test - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address
 */
package paras.Coding_exam_18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortStudentInfo implements Comparable<SortStudentInfo> {
	
	int rNo;
	String firstName;
	String lastName;
	String address;
	
	public SortStudentInfo(int rNo, String firstName, String lastName, String address) {
		this.rNo = rNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public int compareTo(SortStudentInfo student) {
		return (int) (this.rNo - student.rNo);		
	}
	
	@Override
	public String toString() {
		return "SortStudentInfo[rNo="+rNo+",firstName="+firstName+",lastName"+lastName+",address="+address+"]\n";
	}
	
	public static void main(String[] args) {
		ArrayList<SortStudentInfo> Student = new ArrayList<SortStudentInfo>();
		SortStudentInfo Student1 = new SortStudentInfo(5, "Akshay", "Rokad", "Rajkot");
		SortStudentInfo Student2 = new SortStudentInfo(1, "Paras", "Rokad", "Rajkot");
		SortStudentInfo Student3 = new SortStudentInfo(8, "Kishan", "Patel", "Ahmedabad");
		
		Student.add(Student1);
		Student.add(Student2);
		Student.add(Student3);
		
		Collections.sort(Student);
		System.out.println(Student);
	}
	
}
