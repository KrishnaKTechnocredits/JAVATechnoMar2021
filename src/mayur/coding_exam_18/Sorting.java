package mayur.coding_exam_18;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		Student e2 =new Student(15,"Mayur","Regundwar","Rajura");
		Student e1 =new Student(1,"Techno","Credits","Pune");
		Student e4 =new Student(4,"Shashank","Dharmadhikari","Solapur");
		Student e3 =new Student(3,"Sandesh","Molane","Solapur");
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(e4);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		for(Student student:list) {
			System.out.println(student);
		}
	}
}
