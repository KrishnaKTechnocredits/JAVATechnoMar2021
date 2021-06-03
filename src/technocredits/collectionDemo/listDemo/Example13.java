package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example13 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		//Student s1 = new Student(1);
		al.add(new Student(1));
		al.add(new Student(2));
		al.add(new Student(3));
		
		System.out.println(al.get(0).getRno());
	}
}
