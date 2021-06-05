/*
 * Test - 18 : 1st Jun'2021
  Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
 
 */
package rupali.codingexam.exam18;
import java.util.HashSet;


public class Objectsortingbycomparable2 {
	public static void main(String[] args) {
		HashSet<Student1> hs=new HashSet<Student1>();
		
		Student1 s1=new Student1(101,"Rupali","Lahoti","Yavatmal");
		Student1 s2=new Student1(102,"Rupali","Lahoti","Yavatmal");
		Student1 s3=new Student1(103,"Vidhi","Lahoti","Yavatmal");
		Student1 s4=new Student1(103,"Vidhi","Lahoti","Yavatmal");
		
	
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println(hs);
	}
}
