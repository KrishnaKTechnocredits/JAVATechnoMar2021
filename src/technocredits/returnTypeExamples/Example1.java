package technocredits.returnTypeExamples;

public class Example1 {

	String m1(int x) {
		if(x == 10) {
			System.out.println("GM");
			return "Maulik";
		}else if(x == 9) {
			return "kajal";
		}
		System.out.println("Hi");
		System.out.println("Vaibhav");
		return "Surbhi";
	}
	/*String printName(int rollNum) {
		if(rollNum == 1)
			
	}*/
	
	void processData(String name) {
		if(name.equals("Maulik")) {
			System.out.println("First name : " + name);
			System.out.println("Last Name : " + "kanani");
			System.out.println("Roll number : " + 1);
		}else if(name.equals("Krishna")) {
			System.out.println("First name : " + name);
			System.out.println("Last Name : " + "kanani");
			System.out.println("Roll number : " + 2);
		}else {
			System.out.println("We dont have any info about " + name);
		}
	}
	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		int rollNo = 10;
		String name = ex1.m1(rollNo);
		ex1.processData(name);
	}
}
