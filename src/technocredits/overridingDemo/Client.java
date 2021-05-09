package technocredits.overridingDemo;

public class Client {
	int x = 10;
	
	Client m1() {
		x = 20;
		return this;
	}
	
	int m2() {
		//System.out.println(x);
		return x;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Client c1 = new Client();
		int ans = c1.m1().m2();
		System.out.println(ans);
		
		Employee e1 = new Employee();
		e1.setData(111, "Aashay", "IT-0101", "Radha");

		Employee e2 = new Employee();
		e2.setData(112, "Anubhav", "IT-0102", "Vaibhav");
		
		System.out.println(e1);
		//System.out.println(e2);
		
		Employee e3 = Employee.createCopy(e1);
		System.out.println(e3);
		//Employee e3 = new Employee();
		
	}
}
