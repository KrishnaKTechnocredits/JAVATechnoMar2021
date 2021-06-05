/*/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package neha_Rathi.codingExam18;

import java.util.*;

public class UniqueListOfStudent {

	public static void main(String[] args) {
		StudentDetails sd  = new StudentDetails(3,"pooja","rathi","mumbai");
		StudentDetails sd1 = new StudentDetails(5,"neha","rathi","pune");
		StudentDetails sd2 = new StudentDetails(2,"radha","tawari","pune");
		StudentDetails sd3 = new StudentDetails(5,"neha","rathi","pune");
		StudentDetails sd4 = new StudentDetails(5,"pooja","rathi","pune");
		StudentDetails sd5 = new StudentDetails(5,"neha","rathi","pune");
		
		//ArrayList<Object> list =new ArrayList<Object>();
		HashSet<Object> hs =new HashSet<Object>();
		hs.add(sd);
		hs.add(sd2);
		hs.add(sd4);
		hs.add(sd1);
		hs.add(sd3);
		hs.add(sd5);
		System.out.println(hs.size());
	}
}
