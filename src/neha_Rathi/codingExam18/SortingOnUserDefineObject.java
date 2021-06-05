/*Program 1: Student -> Sorting based on student rno.
 rno, first, lastname, address
*/
package neha_Rathi.codingExam18;
import java.util.ArrayList;
import java.util.Collections;

public class SortingOnUserDefineObject {

	public static void main(String[] args) {
		StudentInfo e4 =new StudentInfo(5,"neha","rathi","pune");
		StudentInfo e1 =new StudentInfo(6,"neha","rathi","pune");
		StudentInfo e2 =new StudentInfo(1,"pooja","rathi","mumbai");
		StudentInfo e3 =new StudentInfo(3,"nandan","tawari","nagar");
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		list.add(e4);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		for(StudentInfo student:list) {
			System.out.println(student);
		}
	}
}
