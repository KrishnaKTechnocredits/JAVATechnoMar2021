/*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/
package prashant.coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingStudentNo {
	public static void main(String[] args) {
		ArrayList<Student> stdlist = new ArrayList<Student>();
		stdlist.add(new Student(107, "Amit", "Jain", "Pune"));
		stdlist.add(new Student(106, "Reva", "Shah", "Pune"));
		stdlist.add(new Student(108, "Amey", "Pate", "Pune"));
		stdlist.add(new Student(109, "Harsh", "Sinha", "Pune"));
		stdlist.add(new Student(110, "Dilip", "kale", "Pune"));
		Collections.sort(stdlist);
		Iterator<Student> std = stdlist.iterator();
		while (std.hasNext()) {
			System.out.println(std.next());
		}
	}
}
