package ankit.coding_exam_18.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CallerArrayListSortBasedOn {

	public static void main(String[] args) {
		ArrayList<Employee> empAL = new ArrayList<Employee>();
		empAL.add(new Employee(1,"Techno", "Pune"));
		empAL.add(new Employee(3,"Credits", "Indore"));
		empAL.add(new Employee(2,"Automation", "Mumbai"));
		empAL.add(new Employee(0,"Selenium", "Tripura"));

		Collections.sort(empAL); 
		/* Collections.sort will call compareTo which is from Comparator Interface 
		 *so we need to override compareTo method as per required in our child class(Employee)
		 */
		System.out.println(empAL);
	}
}
