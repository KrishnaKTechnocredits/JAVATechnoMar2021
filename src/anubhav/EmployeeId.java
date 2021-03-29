package anubhav;

class EmployeeId{
	int empId=10;
	
	void updateEmpId(){
		int empId=100;
		System.out.println(empId);
	}
	void showEmpId(){
		System.out.println(empId);
	}
	
	public static void main(String[] args){
	EmployeeId employeeId= new EmployeeId();
	employeeId.empId= 300;
	employeeId.showEmpId();
	employeeId.updateEmpId();
	employeeId.updateEmpId();
	}
} 