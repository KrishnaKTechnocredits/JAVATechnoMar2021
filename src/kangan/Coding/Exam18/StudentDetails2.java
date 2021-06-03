package kangan.Coding.Exam18;

import java.util.HashSet;

public class StudentDetails2 {

	public static void main(String[] args) {
		
		HashSet<Student2> set = new HashSet<Student2>();
		Student2 s1 = new Student2(5,"Kangan","Gautam","Pune");
		Student2 s2 = new Student2(2,"Bines","Samal","Odisha");
		Student2 s3 = new Student2(5,"Kangan","Gautam","Bihar");
		Student2 s4 = new Student2(4,"Riya","Sharma","Pune");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
		//Collections.sort(set);
		//Hash set we cannot use sort as we can only use in array list.. In set and map they have treeset and treemap for ascending order
		
		/* Here it will accept the same value in HS as it is comparing the memory address rather than values.
		 * So we need to override equals method of object class in our wrapper class 
		 * because as of now its default implementation compares memory address, But here we need to compare value.
		 * Still there is an Hashcode method which need to override as equals and hashcode method having agreement/Contract.
		 * Hashcode will give the bucket and if bucket is same then only equals is called.
		 */
		
	}
}
