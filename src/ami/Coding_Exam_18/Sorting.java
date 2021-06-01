/*
  Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
 */

package ami.Coding_Exam_18;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(10, "RADHA", "PATEL", "RAHURAJ MALL"));

		list.add(new Student1(15, "RADHA", "MODI", "MULTIPLEX MALL"));
		list.add(new Student1(14, "JIYU", "JAIN", "CIRCLE MALL"));
		list.add(new Student1(10, "MONA", "RAJ", "HANSRAJ MALL"));
		list.add(new Student1(45, "MONA", "RAJ", "HANSRAJ MALL"));

		System.out.println(list.size());

		Collections.sort(list);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

	}
}
