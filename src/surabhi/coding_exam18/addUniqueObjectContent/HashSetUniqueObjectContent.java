package surabhi.coding_exam18.addUniqueObjectContent;

import java.util.HashSet;

/*Program 2: Student -> return unique list of Student.
		 rno, first, lastname, address
		 Note : if rno and firstname is same then objects are duplicate.*/

public class HashSetUniqueObjectContent {
	
	
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		
		Student s1=new Student(101,"surabhi", "atal", "pune");
		Student s2=new Student(102,"shreyash", "atal", "pune");
		Student s3=new Student(103,"saurabh", "rathi", "pune");
		Student s4=new Student(102,"surabhi", "rathi", "pune");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println(hs);
		
	}

}
