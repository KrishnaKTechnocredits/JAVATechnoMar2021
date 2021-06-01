package ankit.coding_exam_18.Equals_HashCode;

import java.util.HashSet;

public class HashMapUDClassElementsUniquenessValidation {

	public static void main(String[] args) {
		HashSet<EmployeeHM> empHS = new HashSet<EmployeeHM>();

		empHS.add(new EmployeeHM(1,"Techno", "Pune"));
		empHS.add(new EmployeeHM(3,"Credits", "Indore"));
		empHS.add(new EmployeeHM(2,"Automation", "Mumbai"));
		empHS.add(new EmployeeHM(0,"Selenium", "Tripura"));
		empHS.add(new EmployeeHM(1,"Techno", "Pune"));
		empHS.add(new EmployeeHM(3,"Credits1", "Pune"));

		/* Here it will accept the same value in HS as it is comparing the memory address rather than values.
		 * So we need to override equals method of object class in our wrapper class 
		 * because as of now its default implementation compares memory address, But here we need to compare value.
		 * Still there is an Hashcode method which need to override as equals and hashcode method having agreement/Contract.
		 * Hashcode will give the bucket and if bucket is same then only equals is called.
		 */

		System.out.println(empHS);
	}
}
