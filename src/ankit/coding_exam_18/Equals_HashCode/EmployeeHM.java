package ankit.coding_exam_18.Equals_HashCode;

public class EmployeeHM {

	private int empID;
	private String empName;
	private String empAddress;

	EmployeeHM (int empID, String empName, String empAddress ){
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public String toString() {
		return empID +"-"+ empName +"-"+ empAddress;
	}

	@Override
	public int hashCode() {

		return this.empID;
	}

	@Override
	// Compared only employee ID 
	/*public boolean equals(Object obj) {
		EmployeeHM emp  = (EmployeeHM)obj;
		if(this.empID==emp.empID)
			return true;
		return false;
	}*/

	// Compared only employee ID and empName
	public boolean equals(Object obj) {
		EmployeeHM emp  = (EmployeeHM)obj;
		if(this.empID==emp.empID && this.empName.equals(emp.empName))
			return true;
		return false;
	}
}
