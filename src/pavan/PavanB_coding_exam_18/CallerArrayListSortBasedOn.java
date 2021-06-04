package pavan.PavanB_coding_exam_18;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class CallerArrayListSortBasedOn {

	public static void main(String[] args) {
		
		ArrayList<Employee> empAL= new ArrayList<Employee>();
		empAL.add(new Employee(2, "techno", "pune"));
		empAL.add(new Employee(3, "credits", "mumbai"));
		empAL.add(new Employee(0, "Raju", "nagpur"));
		
	Collections.sort(empAL);
		
		System.out.println(empAL);
}
}