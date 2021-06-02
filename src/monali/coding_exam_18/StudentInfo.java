package monali.coding_exam_18;

import java.util.HashSet;

public class StudentInfo {

	public static void main(String[] args) {
		
		HashSet<Student_program_2> setOfStudent = new HashSet<Student_program_2>();
		setOfStudent.add(new Student_program_2(21,"Saurav","Tondare","Pune"));
		setOfStudent.add(new Student_program_2(25,"Vikas","Sahare","Nagpur"));
		setOfStudent.add(new Student_program_2(14,"Prashant","Mahajan","Satara"));
		setOfStudent.add(new Student_program_2(21,"Saurav","Raut","Gujrat"));
		setOfStudent.add(new Student_program_2(46,"Pratik","Bais","Yavatmal"));
		
		System.out.println(setOfStudent.size());
		System.out.println(setOfStudent);
		
		
	}
}

