package ami;

public class Example1{
	int empId = 10; 
	
	void updateEmpId(){
		empId = 100;
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