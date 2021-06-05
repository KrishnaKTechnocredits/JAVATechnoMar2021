package madhavi_Khasbage.Coding_Exam_18;

import java.util.ArrayList;
import java.util.Collections;

/*Test - 18 : 1st Jun'2021
Program 1: Student -> Sorting based on student rno.
rno, first, lastname, address*/


public class ArrayListSorting {
	
	public static void main(String[] args) {
		ArrayList<Student> arrList=new ArrayList<Student>();
		Student s1= new Student(444,"Madhavi","Khasbage","Nanded city, Pune");
		Student s2=new Student(222,"Dipali","Zagade","Kothrud, Pune");
		Student s3=new Student(111,"Smita","Sambare","Hadapsar, Pune");
		Student s4=new Student(333,"Anuja","Magar", "Magarpatta, Pune");
		arrList.add(s1);
		arrList.add(s2);
		arrList.add(s3);
		arrList.add(s4);		
		System.out.println("Input:");
		System.out.println(arrList + "\n");		
		System.out.println("Output:");
		Collections.sort(arrList);
		System.out.println(arrList);
	}
}
