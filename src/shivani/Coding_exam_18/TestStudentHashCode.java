package shivani.Coding_exam_18;
/*Program 2: Student -> return unique list of Student.
		 rno, first, lastname, address
		 Note : if rno and firstname is same then objects are duplicate*/

import java.util.HashSet;


public class TestStudentHashCode {
	
		public static void main(String[] args) {
			HashSet<StudentInfo2> studlist = new HashSet<StudentInfo2>();
			StudentInfo2 s1= new StudentInfo2(1,"Shivani","Soni","Pune");
			StudentInfo2 s2= new StudentInfo2(5,"Sakshi","gupta","jalaun");
			StudentInfo2 s3= new StudentInfo2(45,"Deepa","gupta","gwalior");
			StudentInfo2 s4= new StudentInfo2(15,"Riya","jain","Bhopal");

			studlist.add(s1);
			studlist.add(s2);
			studlist.add(s3);
			studlist.add(s4);
			studlist.add(s2);
			studlist.add(s1);
			System.out.println(studlist);
		}


}
