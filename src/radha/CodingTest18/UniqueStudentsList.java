package radha.CodingTest18;

import java.util.HashSet;

public class UniqueStudentsList {
	
	public static void main(String[] args) {
		HashSet<StudentInfo> studentSet = new HashSet<StudentInfo>(); 
		StudentInfo st1 = new StudentInfo(15023, "Radha", "Saoji", "Pune");
		StudentInfo st2 = new StudentInfo(15060, "Isha", "Saoji", "Pune");
		StudentInfo st3 = new StudentInfo(15023, "Radha", "Saoji", "Pune");
		
		studentSet.add(st1);
		studentSet.add(st2);
		studentSet.add(st3);
		
		System.out.println(studentSet);
	}
}