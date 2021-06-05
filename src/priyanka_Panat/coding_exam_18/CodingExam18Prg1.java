/*
Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/

package priyanka_Panat.coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;

public class CodingExam18Prg1 {
	public static void main(String[] args) {
		ArrayList<Student> listOfStud = new ArrayList<>();
		Student s1 = new Student(401, "rekha", "patil", "Pune");
		Student s2 = new Student(205, "anand", "panat", "Nagpur");
		Student s3 = new Student(588, "shriya", "Joshi", "Mumbai");
		Student s4 = new Student(878, "manisha", "kulkarni", "Pune");

		listOfStud.add(s1);
		listOfStud.add(s2);
		listOfStud.add(s3);
		listOfStud.add(s4);

		Collections.sort(listOfStud);
		System.out.println("Sorted list is : ");
		for (Student student : listOfStud) {
			System.out.println(student);
		}

	}
}
