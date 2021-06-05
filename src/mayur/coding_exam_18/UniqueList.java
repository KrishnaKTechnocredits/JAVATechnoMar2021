package mayur.coding_exam_18;
import java.util.*;

public class UniqueList {
	public static void main(String[] args) {
		StudentDetails sd  = new StudentDetails(3,"Sandesh","Molane","Solapur");
		StudentDetails sd1 = new StudentDetails(5,"Techno","Credits","Pune");
		StudentDetails sd2 = new StudentDetails(2,"Mayur","Regundwar","Rajura");
		StudentDetails sd3 = new StudentDetails(5,"Techno","Credits","Pune");
		StudentDetails sd4 = new StudentDetails(5,"Techno","Credits","Pune");
		StudentDetails sd5 = new StudentDetails(5,"Techno","Credits","Pune");


		HashSet<Object> hash =new HashSet<Object>();
		hash.add(sd);
		hash.add(sd2);
		hash.add(sd4);
		hash.add(sd1);
		hash.add(sd3);
		hash.add(sd5);
		System.out.println(hash.size());
	}
}
