 /*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address*/
package sangeeta.CodingExam;

import java.util.ArrayList;
import java.util.Collections;

public class CodingExam18_P1 {
	
	static void sortStudentData() {
		ArrayList<Student> stddata = new ArrayList<Student>();
		stddata.add(new Student(2,"Jay", "Bohare", "Pune"));
		stddata.add(new Student(1,"Sharvi", "Dhumal", "Kolhapur"));
		stddata.add(new Student(4,"Atiksh", "Shivankar", "Indore"));
		stddata.add(new Student(3,"Anshu", "Bagade", "Gondia"));
		
		Collections.sort(stddata);
		System.out.println(stddata);
	}
	
	public static void main(String[] args) {
		CodingExam18_P1.sortStudentData();
	}
}
