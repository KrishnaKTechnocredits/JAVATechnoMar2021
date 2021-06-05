package sandesh.coding_exam_18;
/*
Test - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address
*/

import java.util.ArrayList;
import java.util.Collections;

public class SortStudent {
	
	public static void main(String[] args) {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		Student s1 = new Student(2, "Chinmay", "More", "Katraj Pune");
		Student s2 = new Student(1, "Aakash", "Dave", "California USA");
		Student s3 = new Student(4, "Vishal", "Dange", "Juhu Mumbai");
		Student s4 = new Student(3, "Shashank", "Darmadhikari", "Solapur");
		
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		
		Collections.sort(listOfStudents);
		System.out.println(listOfStudents);
		
		
	}
}