package technocredits.collectionDemo.comparableDemo;

import java.util.Comparator;

public class StudentFirstNameComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		return o1.getFname().compareTo(o2.getFname());
	}
}
