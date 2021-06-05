package kajal.Codingexam;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable18p1 {
	public static void main(String[] args) {
		ArrayList<Student18p1> namelist = new ArrayList<Student18p1>();

		namelist.add(new Student18p1(106, "kajal", "patil", "satara"));
		namelist.add(new Student18p1(101, "priya", "kirdat", "pune"));
		namelist.add(new Student18p1(103, "pooja", "more", "nashik"));
		namelist.add(new Student18p1(102, "priyal", "mane", "pune"));

		System.out.println("Before sorting" + namelist);
		Collections.sort(namelist);
		System.out.println("After sorting" + namelist);
	}

}
