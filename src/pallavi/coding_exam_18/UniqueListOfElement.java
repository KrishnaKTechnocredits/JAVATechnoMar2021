package pallavi.coding_exam_18;

import java.util.HashSet;

public class UniqueListOfElement {

	int rollNo;
	String firstName;
	String lastName;
	String address;

	public UniqueListOfElement(int rollNo, String firstName, String lastName, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public boolean equals(Object obj) {
		UniqueListOfElement emp = (UniqueListOfElement) obj;
		if (this.rollNo == emp.rollNo && this.firstName.equals(emp.firstName))
			return true;
		else
			return false;
	}

	public int hashCode() {
		return this.rollNo;

	}

	@Override
	public String toString() {
		return "UniqueListOfElement [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]\n";
	}

	public static void main(String[] args) {
		HashSet<UniqueListOfElement> detailsOfStudents = new HashSet<UniqueListOfElement>();
		UniqueListOfElement stu1 = new UniqueListOfElement(2, "Raj", "Pallavi", "Patna");
		UniqueListOfElement stu2 = new UniqueListOfElement(10, "Ashwini", "Shukla", "Pune");
		UniqueListOfElement stu3 = new UniqueListOfElement(2, "Raj", "Pallavi", "Patna");
		UniqueListOfElement stu4 = new UniqueListOfElement(8, "Sharma", "Pallavi", "Kolkata");
		detailsOfStudents.add(stu1);
		detailsOfStudents.add(stu2);
		detailsOfStudents.add(stu3);
		detailsOfStudents.add(stu4);
		System.out.println(detailsOfStudents);

	}

}
