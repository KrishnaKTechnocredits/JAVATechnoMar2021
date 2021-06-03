package technocredits.collectionDemo.comparableDemo;

public class Employee implements Comparable<Employee>{

	private int empid;
	private String empname;
	private double empSalary;
	
	public Employee(int empid, String empname, double empSalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee emp) { // e2 -> e1 , e3 -> e2, e4 -> e3, e4 -> e2, e4 -> e3
		return (int)(this.empSalary - emp.empSalary);
//		if(this.empSalary - emp.empSalary > 0)
//			return 1;
//		else if(this.empSalary - emp.empSalary < 0)
//			return -1;
//		else 
//			return 0;
	}
	
	/*@Override
	public int compareTo(Employee emp) {
		return this.empname.compareTo(emp.empname);
	}*/

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
