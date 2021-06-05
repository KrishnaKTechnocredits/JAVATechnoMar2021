/*
 *  Test - 18 : 1st Jun'2021
 Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
 */
package rupali.codingexam.exam18;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
public class Objectsortingbycomparable1 {
	
	public static void main(String[] args) {
		Student s1=new Student(102,"Rupali","Lahoti","Yavatmal");
		Student s2=new Student(101,"Darshit","Lahoti","Yavatmal");
		Student s3=new Student(103,"Vidhi","Lahoti","Yavatmal");
		Student s4=new Student(104,"Amit","Lahoti","Yavatmal");
		
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		System.out.println(al);
	}
}
