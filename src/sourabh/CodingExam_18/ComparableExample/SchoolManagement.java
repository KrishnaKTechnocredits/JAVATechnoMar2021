package sourabh.CodingExam_18.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolManagement {
	
	public static void main(String[] args) {
		ArrayList<Student> listofStudent= new ArrayList<Student>();
		Student stu1= new Student(102, "Abhi", "Sen", "XYZ");
		Student stu2= new Student(101, "Debo", "Das", "ABC");
		Student stu3= new Student(103, "Roni", "Ray", "EFG");
		listofStudent.add(stu1);
		listofStudent.add(stu2);
		listofStudent.add(stu3);
		
		Collections.sort(listofStudent);
		System.out.println(listofStudent);
	}

}
