package radha.CodingTest18;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudentsClient {
	public static void main(String[] args) {
		ArrayList<StudentDetails> studentDet = new ArrayList<StudentDetails>();
		StudentDetails s1 = new StudentDetails(1011, "Radha", "Saoji", "Pune");
		StudentDetails s2 = new StudentDetails(1052, "Isha", "Saoji", "Pune");
		StudentDetails s3 = new StudentDetails(1000, "Nupur", "Saoji", "Mumbai");
		StudentDetails s4 = new StudentDetails(1151, "Shrug", "Saoji", "Mehkar");
		StudentDetails s5 = new StudentDetails(1254, "Atharv", "Saoji", "Nagpur");
		
		studentDet.add(s1);
		studentDet.add(s2);
		studentDet.add(s3);
		studentDet.add(s4);
		studentDet.add(s5);
		
		Collections.sort(studentDet);
		System.out.println(studentDet);
	}
}
