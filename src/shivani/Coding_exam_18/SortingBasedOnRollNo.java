package shivani.Coding_exam_18;
/*Program 1: Student -> Sorting based on student rno.
rno, name, classname,*/

import java.util.ArrayList;
import java.util.Collections;

public class SortingBasedOnRollNo {
	public static void main(String[] args) {
	ArrayList <StudentInfo>input= new ArrayList<StudentInfo>();
	 StudentInfo s1 = new StudentInfo(18,"Deepa","10thB");
	 StudentInfo s2 = new StudentInfo(10,"Madhavi","10thC");
	 StudentInfo s3 = new StudentInfo(22,"sakshi","10thA");
	 StudentInfo s4 = new StudentInfo(13,"Shalini","10thA");

	input.add(s1);
	input.add(s2);
	input.add(s3);
	input.add(s4);
	
	Collections.sort(input);
	System.out.println(input);
	
}
}