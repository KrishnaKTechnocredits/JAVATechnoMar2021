/*
 Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
 */

package ami.Coding_Exam_18;

import java.util.HashSet;

public class UniqListStdHashCode {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(10, "RADHA", "PATEL", "RAHURAJ MALL"));
		hs.add(new Student(10, "MONA", "RAJ", "HANSRAJ MALL"));
		hs.add(new Student(15, "RADHA", "MODI", "MULTIPLEX MALL"));
		hs.add(new Student(14, "JIYU", "JAIN", "CIRCLE MALL"));

		System.out.println(hs.size());
		System.out.println(hs);
	}

}
