package ami;

class Example1{
	int empId = 10; // global variable // instant variable
	
	void updateEmpId(){
		empId = 100; // it's not a variable only value change // when 1st we add data type then consider as local variable
		System.out.println(empId);
	}
	
	void showEmpId(){
		System.out.println(empId);
	}
	
	public static void main(String[] a){
		Example1 example1= new Example1();
		example1.showEmpId();
		example1.updateEmpId();
		example1.showEmpId();
	}
}