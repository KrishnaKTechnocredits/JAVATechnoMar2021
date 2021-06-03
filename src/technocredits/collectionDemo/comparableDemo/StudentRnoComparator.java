package technocredits.collectionDemo.comparableDemo;

import java.util.Comparator;

public class StudentRnoComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		return o1.getRno() - o2.getRno();
	}
}
