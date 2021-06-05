package ankit.coding_exam_18.Comparable;

public class Employee implements Comparable<Employee>{

	private int empID;
	private String empName;
	private String empAddress;

	Employee (int empID, String empName, String empAddress ){
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public String toString() {
		return empID +"-"+ empName +"-"+ empAddress;
	}
	
	@Override
	//Uncomment any one compareTo method as per required sorting
	//		 Sort Based on empID
	public int compareTo(Employee emp) {
		return (this.empID - emp.empID);
	}
	
	//Sort based on empName
	/*public int compareTo(Employee emp) {
		return this.empName.compareTo(emp.empName);
	}*/
	//Sort based on empAddress
	/*public int compareTo(Employee emp) {
		return this.empAddress.compareTo(emp.empAddress);
	}*/
	
	
}
