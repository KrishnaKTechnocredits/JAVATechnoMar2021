package surabhi.coding_exam18.sortingOnObjectsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOnObjectContent {


	public static void main(String[] args) {
		Student s1=new Student(104, "surabhi", "atal", "pune");
		Student s2=new Student(102, "shreyash", "atal", "pune");
		Student s3=new Student(103, "saurabh", "rathi", "pune");
		Student s4=new Student(101, "surabhi", "rathi", "pune");
		ArrayList<Student> al=new ArrayList<Student> ();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		System.out.println(al);
	}

}
