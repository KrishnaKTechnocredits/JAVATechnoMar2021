package kangan.Coding.Exam18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class StudentDetails {

	
	
	public static void main(String[] args) {
		ArrayList<Student> setData = new ArrayList<Student>();
		
		Student s1 = new Student(5,"Kangan","Gupta","Pune",100);
		Student s2 = new Student(2,"Bines","Samal","Odisha",10000);
		Student s3 = new Student(3,"Ayush","Gautam","Bihar",300);
		Student s4 = new Student(4,"Riya","Sharma","Pune",50000);
		
		setData.add(s1);
		setData.add(s2);
		setData.add(s3);
		setData.add(s4);
		//To sort in ascending order
		Collections.sort(setData);
		System.out.println(setData);
		//to sort in decending order
		//Collections.reverse(setData);
		//System.out.println(setData);
		
	}
}
