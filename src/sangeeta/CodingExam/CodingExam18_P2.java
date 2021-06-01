/*Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.
*/
package sangeeta.CodingExam;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CodingExam18_P2 {
	
	static void addStudentData() {
		LinkedHashSet<Student2> stddata = new LinkedHashSet<Student2>();
		Student2 s1 = new Student2(1,"Jay", "Bohare", "Pune");
		Student2 s2 = new Student2(2,"Sharvi", "Dhumal", "Kolhapur");
		Student2 s3 = new Student2(3,"Atiksh", "Shivankar", "Indore");
		Student2 s4 = new Student2(4,"Anshu", "Bagade", "Gondia");
		Student2 s5 = new Student2(4,"Anshu", "Kamble", "Parwa");
		
		stddata.add(s1);
		stddata.add(s2);
		stddata.add(s3);
		stddata.add(s4);
		stddata.add(s5);
		stddata.add(s4);
		stddata.add(s1);
		
		System.out.println(stddata);
		System.out.println(stddata.size());
	}
	
	public static void main(String[] args) {
		CodingExam18_P2.addStudentData();
	}
}
