package shashank.coding_exam18;

import java.util.ArrayList;
import java.util.Collections;

public class SortedStudentList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "Shahank", "Tingare Nagar"));
		list.add(new Student(24, "Pooja", "Old Cidco"));
		list.add(new Student(24, "Shweta", "Kothrud"));
		// sortedStudentList
		Collections.sort(list);
		System.out.println(list);
	}

}
