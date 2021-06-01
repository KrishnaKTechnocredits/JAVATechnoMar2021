package ravindra_J.coding_exam_18_CollectionClass;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> studlist = new ArrayList<Student>();
		Student s1= new Student(11,"Techno","Credits","Pune","A+ -Grade");
		Student s2= new Student(5,"Ravindra","Jadhav","Amravati","B+ -Grade");
		Student s3= new Student(3,"Sushma","Gaware","Pune","A -Grade");
		Student s4= new Student(15,"Rahul","Desai","Solapur","C-Grade");
         
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
		studlist.add(s4);
		Collections.sort(studlist);
		System.out.println(studlist);
	}

}

