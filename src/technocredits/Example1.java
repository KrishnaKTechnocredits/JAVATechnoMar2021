package technocredits;

class Example1{
	int empId = 10; // Instance Variable // Global variable
	
	void updateEmpId(){
		empId = 100;
		System.out.println(empId);
	}
	
	void showEmpId(){
		System.out.println(empId);
	}
	
	public static void main(String[] a){
		Example1 example1 = new Example1();
		example1.empId = 300;
		example1.showEmpId(); // 300
		example1.updateEmpId(); //100
		example1.showEmpId(); // 100
	}
}