package aashay.Test_18;
/*
 * SortingsingTest - 18 : 1st Jun'2021
Program 2: Student -> return unique list of Student.
rno, first, lastname, address
Note : if rno and firstname is same then objects are duplicate.
 */

import java.util.HashSet;

public class SortingDuplicateRollNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<StudentDuplicateRollNo> hashSet = new HashSet<StudentDuplicateRollNo>();
		
		StudentDuplicateRollNo studentDuplicateRollNo1 = new StudentDuplicateRollNo(104,"Shaurya","Pilivkar","Pune");
		StudentDuplicateRollNo studentDuplicateRollNo2 = new StudentDuplicateRollNo(104,"Aashay","Pilivkar","Pune");
		StudentDuplicateRollNo studentDuplicateRollNo3 = new StudentDuplicateRollNo(103,"Neha","Pilivkar","Pune");
		StudentDuplicateRollNo studentDuplicateRollNo4 = new StudentDuplicateRollNo(102,"Sneha","Pilivkar","Pune");
		
		hashSet.add(studentDuplicateRollNo1);
		hashSet.add(studentDuplicateRollNo2);
		hashSet.add(studentDuplicateRollNo3);
		hashSet.add(studentDuplicateRollNo4);
		System.out.println(hashSet);
		

	}

}
