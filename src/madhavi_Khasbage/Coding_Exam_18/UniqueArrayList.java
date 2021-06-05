package madhavi_Khasbage.Coding_Exam_18;

import java.util.ArrayList;
import java.util.Collections;

/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
 */

public class UniqueArrayList {
	public static void main(String[] args) {

		ArrayList<Student1> arrList1 = new ArrayList<Student1>();
		Student1 s1 = new Student1(444, "Madhavi", "Khasbage", "Nanded city, Pune");
		Student1 s2 = new Student1(111, "Dipali", "Zagade1", "Kothrud, Pune");
		Student1 s3 = new Student1(121, "Dipali", "Zagade", "Kothrud, Pune");
		Student1 s4 = new Student1(445, "Madhavi1", "Khasbage", "Nanded city, Pune");
		Student1 s5 = new Student1(111, "Dipali", "Zagade2", "Kothrud, Pune");

		AddStudent(arrList1, s1);
		AddStudent(arrList1, s2);
		AddStudent(arrList1, s3);
		AddStudent(arrList1, s4);
		AddStudent(arrList1, s5);
		System.out.println(arrList1);
	}

	public static void AddStudent(ArrayList<Student1> exitingArray, Student1 student) {
		boolean hasStudnet = false;
		for (int i = 0; i < exitingArray.size(); i++) {
			Student1 existingStudent = exitingArray.get(i);
			if (existingStudent.equals(student)) {
				hasStudnet = true;
				break;
			}
		}
		if (hasStudnet == false) {
			exitingArray.add(student);
		}
	}
}
