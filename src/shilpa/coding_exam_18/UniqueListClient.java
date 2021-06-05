/*/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package shilpa.coding_exam_18;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueListClient {
	public static void main(String[] args) {
		int cnt = 0;
		ArrayList<UniqueListStudent> stdUniqueList = new ArrayList<UniqueListStudent>();
		HashSet<UniqueListStudent> stdUniqueSet = new HashSet<UniqueListStudent>();

		UniqueListStudent s1 = new UniqueListStudent(5, "Shilpa", "Akarte", "pune");
		UniqueListStudent s2 = new UniqueListStudent(3, "Ruchi", "Agarwal", "Ahemedabad");
		UniqueListStudent s3 = new UniqueListStudent(2, "Priya", "Tiwari", "Jamshedpur");
		UniqueListStudent s4 = new UniqueListStudent(5, "Shilpa", "Akarte", "pune");
		UniqueListStudent s5 = new UniqueListStudent(2, "Priya", "Tiwari", "Jamshedpur");

		stdUniqueList.add(s1);
		stdUniqueList.add(s2);
		stdUniqueList.add(s3);
		stdUniqueList.add(s4);
		stdUniqueList.add(s5);

		System.out.println("Unique List Of Students\n");
		for (UniqueListStudent obj : stdUniqueList) {
			stdUniqueSet.add(obj);
		}

		for (Object obj : stdUniqueSet) {
			System.out.println(obj);
		}
	}
}
