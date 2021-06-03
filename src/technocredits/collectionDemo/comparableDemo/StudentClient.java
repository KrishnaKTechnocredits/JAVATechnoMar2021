package technocredits.collectionDemo.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;

public class StudentClient {

	public static void main(String[] args) {
		Student student3 = new Student(31, "Maulik", "Kanani", 'B');
		Student student1 = new Student(1, "Ankit", "Malvi", 'A');
		Student student2 = new Student(2, "Harsh", "Vegada", 'C');
		
		ArrayList<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(student1);
		listOfStudent.add(student2);
		listOfStudent.add(student3);
		
		Collections.sort(listOfStudent, new StudentRnoComparator());
		
		for(Student student : listOfStudent) {
			System.out.println(student.getRno() + "-" + student.getFname());
		}
	}
}
