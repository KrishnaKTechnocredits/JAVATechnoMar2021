package aashay.Test_18;

import java.util.ArrayList;
import java.util.Collections;


/*
 * SortingsingTest - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address

 */

public class SortingOnRollNo {
	
	 
	public static void main(String[] args) {
		StudentRollNo studentRollNo1 = new StudentRollNo(104,"Shaurya","Pilivkar","Pune");
		StudentRollNo studentRollNo2 = new StudentRollNo(102,"Aashay","Pilivkar","Pune");
		StudentRollNo studentRollNo3 = new StudentRollNo(101,"Sneha","Pilivkar","Pune");
		StudentRollNo studentRollNo4 = new StudentRollNo(103,"Neha","Pilivkar","Pune");
		
		ArrayList<StudentRollNo> arrayList = new ArrayList<StudentRollNo>();
		arrayList.add(studentRollNo1);
		arrayList.add(studentRollNo2);
		arrayList.add(studentRollNo3);
		arrayList.add(studentRollNo4);
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		
	}

}
