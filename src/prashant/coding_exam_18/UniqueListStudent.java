/* Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate*/
package prashant.coding_exam_18;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueListStudent {
	public static void main(String[] args) {
		HashSet<StudentUnique> stdlist = new HashSet<StudentUnique>();
		stdlist.add(new StudentUnique(107, "Amit", "Jain", "Pune"));
		stdlist.add(new StudentUnique(106, "Reva", "Shah", "Pune"));
		stdlist.add(new StudentUnique(108, "Amey", "Pate", "Pune"));
		stdlist.add(new StudentUnique(106, "Reva", "Shah", "Pune"));
		stdlist.add(new StudentUnique(110, "Dilip", "kale", "Pune"));
		Iterator<StudentUnique> std = stdlist.iterator();
		while (std.hasNext()) {
			System.out.println(std.next());
		}
	}
}
