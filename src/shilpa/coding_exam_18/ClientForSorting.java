/*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/
package shilpa.coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;

public class ClientForSorting {
	public static void main(String[] args) {
		ArrayList<StudentForSorting> studentList = new ArrayList<StudentForSorting>();
		StudentForSorting std1 = new StudentForSorting(5, "Shilpa", "Akarte", "pune");
		StudentForSorting std2 = new StudentForSorting(3, "Ruchi", "Agarwal", "Ahemedabad");
		StudentForSorting std3 = new StudentForSorting(2, "Priya", "Tiwari", "Jamshedpur");
		StudentForSorting std4 = new StudentForSorting(1, "Rupali", "Jain", "Nagpur");

		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		studentList.add(std4);

		Collections.sort(studentList);
		System.out.println("Sorted Student List");
		for (Object obj : studentList) {
			System.out.println(obj);
		}

	}

}
