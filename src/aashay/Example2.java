package aashay;

class Example2{
	int empId = 10; // Instance Variable  
	
	void updateEmpId(){
		int empId = 100; // Local
		System.out.println(empId);
	}
	
	void showEmpId(){
		System.out.println(empId);
	}
	
	public static void main(String[] a){
		Example2 example2_1 = new Example2();
		example2_1.empId = 300;
		example2_1.showEmpId(); 
		example2_1.updateEmpId(); 
		example2_1.showEmpId();
	}
}