package ravindra_J.coding_exam_18_CollectionClass;

import java.util.HashSet;

public class TestH{

	public static void main(String[] args) {
		HashSet<StudentH> studset = new HashSet<StudentH>();
		StudentH s1= new StudentH(11,"Ravindra","Credits","Pune","A+ -Grade");
		StudentH s2= new StudentH(11,"Ravindra","Jadhav","Amravati","B+ -Grade");
		StudentH s3= new StudentH(3,"Sushma","Gaware","Pune","A -Grade");
		StudentH s4= new StudentH(15,"Rahul","Desai","Solapur","C-Grade");
		
		studset.add(s1);
		studset.add(s2);
		studset.add(s3);
		studset.add(s4);
		studset.add(s2);
		studset.add(s3);
		//System.out.println(studset.size());//4
		System.out.println(studset);
	}
}
