package technocredits.collectionDemo.impExamples;

public class Employee {

	private int empid;
	private String empname;
	private double empSalary;
	
	
	Employee(int empid, String empname, double empSalary){
		this.empid = empid;
		this.empname = empname;
		this.empSalary = empSalary;
	}

	public int getEmpid() {
		Object obj = new Object();
		obj.equals(obj);
		return empid;
	}

	public String getEmpname() {
		return empname;
	}

	public double getEmpSalary() { 
		return empSalary;
	}
	
	@Override
	public int hashCode() {
		return this.empid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee)obj;
		if(this.empid == e1.empid && this.empname.equals(e1.empname) && this.empSalary == e1.empSalary)
			return true;
		else
			return false;
	}
}
