/*Program 2: Student -> return unique list of Student.
 rno, first, lastname, address
 Note : if rno and firstname is same then objects are duplicate.*/

package simmi.exam18;

import java.util.HashMap;

public class UniqueStudentDetails {
	int rollNum;
	String firstName;
	String lastName;
	String address;

	UniqueStudentDetails(String firstName, String lastName, String address) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		UniqueStudentDetails usd = (UniqueStudentDetails) obj;
		if ((this.rollNum == usd.rollNum) && (this.firstName.equals(usd.firstName))
				&& (this.lastName.equals(usd.lastName)) && (this.address.equals(usd.address)))
			return true;
		return false;
	}

	public String toString() {
		return " First Name = " + firstName + " Last Name = " + lastName + " Address = " + address;
	}

	public int hashcode() {
		return this.rollNum;
	}

	public static void main(String[] args) {

		HashMap<Integer, UniqueStudentDetails> studentMap = new HashMap<Integer, UniqueStudentDetails>();

		UniqueStudentDetails student1 = new UniqueStudentDetails("Sheldon", "Cooper", "Big Bang Theory");
		UniqueStudentDetails student2 = new UniqueStudentDetails("Charlie", "Sheen", "Two and Half Men");
		UniqueStudentDetails student3 = new UniqueStudentDetails("Jesse", "Pinkman", "Breaking Bad");
		UniqueStudentDetails student4 = new UniqueStudentDetails("Jesse", "Pinkman", "Breaking Bad");
		UniqueStudentDetails student5 = new UniqueStudentDetails("Micheal", "Scott", "The Office");
		UniqueStudentDetails student6 = new UniqueStudentDetails("Micheal", "Scott", "The Office");

		studentMap.put(5, student1);
		studentMap.put(6, student2);
		studentMap.put(1, student3);
		studentMap.put(1, student4);
		studentMap.put(4, student5);
		studentMap.put(4, student6);

		System.out.println("Total unique elements are : " + studentMap.size());
		System.out.println(studentMap);
	}
}
