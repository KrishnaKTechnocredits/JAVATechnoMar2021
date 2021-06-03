package madhavi_Raut.CodingExam.Exam_18.Program1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingComparable {
	public static void main(String[] args) {

		Student student1 = new Student(02, "Brandy", "BLast", "add 02");
		Student student2 = new Student(03, "Candy", "CLast", "add 03");
		Student student3 = new Student(01, "Andy", "ALast", "add 01");

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(student1);
		al.add(student2);
		al.add(student3);

		Collections.sort(al);
		System.out.println("Sorted list of student according to roll number: "+al);

	}

}