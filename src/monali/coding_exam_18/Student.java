package monali.coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	
	int rollNo;
	String firstName;
	String lastName;
	String address;
	
	public Student(int rollNo, String firstName, String lastName, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollNo - o.rollNo > 0)
		return 1;
		else if(this.rollNo - o.rollNo < 0)
			return -1;
		else
			return 0;
			
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}

	public static void main(String[] args) {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		Student s1 = new Student(12,"Saurav","Gayakwad","Pune");
		Student s2 = new Student(34,"Monali","Tondare","Yavatmal");
		Student s3 = new Student(86,"Radhika","Bhosale","Satara");
		Student s4 = new Student(56,"Suraj","Jadhav","Pune");
		Student s5 = new Student(48,"Priyanka","Rajput","Nagpur");
		
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);
		
		Collections.sort(listOfStudents);
		System.out.println(listOfStudents);

	}
	

}
