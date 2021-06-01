package shashank.coding_exam18;

import java.util.HashSet;

public class UniqueStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student2> set = new HashSet<Student2>();
		set.add(new Student2(3, "Shahank", "Tingare Nagar"));
		set.add(new Student2(24, "Pooja", "Old Cidco"));
		set.add(new Student2(24, "Pooja", "Kothrud"));
		// sortedStudentList

		System.out.println(set);

	}

}
