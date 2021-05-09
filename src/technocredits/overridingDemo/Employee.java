package technocredits.overridingDemo;

import java.util.Comparator;

public class Employee extends Object implements Cloneable{

	int empid;
	String empName;
	String deptName;
	String managerName;

	void setData(int empid, String empName, String deptName, String managerName) {
		this.empid = empid;
		this.empName = empName;
		this.deptName = deptName;
		this.managerName = managerName;
	}

	static Employee createCopy(Employee e1) throws CloneNotSupportedException {
		Employee e = (Employee) e1.clone();
		return e;
	}

	@Override
	public String toString() {
		return "Employee Name is " + empName + " and Employee id is " + empid;
	}
	/*
	 * public void setEmpid(int empid) { this.empid = empid; }
	 * 
	 * public void setEmpName(String empName) { this.empName = empName; }
	 * 
	 * public void setDeptName(String deptName) { this.deptName = deptName; }
	 * 
	 * public void setManagerName(String managerName) { this.managerName =
	 * managerName; }
	 */

}
