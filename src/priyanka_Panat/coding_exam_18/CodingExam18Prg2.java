/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package priyanka_Panat.coding_exam_18;

import java.util.LinkedHashSet;

public class CodingExam18Prg2 {
	public static void main(String[] args) {
		LinkedHashSet<Student2> set1 = new LinkedHashSet<Student2>();

		Student2 s2 = new Student2(111, "shriya", "joshi", "Pune");
		Student2 s3 = new Student2(256, "spruha", "joshi", "nagpur");
		Student2 s4 = new Student2(111, "shriya", "joshi", "mumbai");
		Student2 s5 = new Student2(256, "spruha", "sakhare", "indore");
		Student2 s6 = new Student2(320, "amruta", "ravat", "nashik");
		Student2 s7 = new Student2(125, "paresh", "durge", "Pune");

		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		set1.add(s5);
		set1.add(s6);
		set1.add(s7);
		System.out.println("Unique list is : ");
		for (Student2 stud : set1) {
			System.out.println(stud);
		}

	}

}
