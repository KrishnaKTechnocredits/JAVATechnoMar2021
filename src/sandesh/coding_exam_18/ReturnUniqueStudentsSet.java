package sandesh.coding_exam_18;
/* 
Program 2: Student -> return unique list of Student.
rno, first, lastname, address
Note : if rno and firstname is same then objects are duplicate.
*/

import java.util.HashSet;

public class ReturnUniqueStudentsSet {

	public static void main(String[] args) {
		HashSet<UniqueStudentClass> setOfStudents = new HashSet<UniqueStudentClass>();

		UniqueStudentClass s1 = new UniqueStudentClass(2, "Chinmay", "More", "Katraj Pune");
		UniqueStudentClass s2 = new UniqueStudentClass(2, "Chinmay", "Patil", "Los Angeles USA");
		UniqueStudentClass s3 = new UniqueStudentClass(1, "Aakash", "Batra", "Katraj Pune");
		UniqueStudentClass s4 = new UniqueStudentClass(1, "Aakash", "Dave", "California USA");
		UniqueStudentClass s5 = new UniqueStudentClass(4, "Vishal", "Dange", "Juhu Mumbai");
		UniqueStudentClass s6 = new UniqueStudentClass(3, "Shashank", "Darmadhikari", "Solapur");

		setOfStudents.add(s1);
		setOfStudents.add(s2);
		setOfStudents.add(s3);
		setOfStudents.add(s4);
		setOfStudents.add(s5);
		setOfStudents.add(s6);

		System.out.println(setOfStudents);
	}
}