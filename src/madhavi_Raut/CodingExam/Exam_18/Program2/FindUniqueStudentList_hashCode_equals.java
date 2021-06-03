package madhavi_Raut.CodingExam.Exam_18.Program2;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*Program02-Student->return unique list of student.
 * Attributes- rollNo, fName, lname, address
 * if rollNo and fName are same then objects are duplicates
 */
public class FindUniqueStudentList_hashCode_equals {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Brian", "BLast", "add 01");
		Student student2 = new Student(2, "Candy", "CLast", "add 02");
		Student student3 = new Student(1, "Brian", "BLast", "add 01");

		HashSet<Student> hs = new LinkedHashSet<Student>();
		hs.add(student1);
		hs.add(student2);
		hs.add(student3);

		System.out.println("Unique rows are: " + hs.size());

		for (Student student : hs) {
			System.out.println(student);
		}
	}
}
