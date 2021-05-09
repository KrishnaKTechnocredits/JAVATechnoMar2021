package technocredits.superthisDemo;

public class ChildExample1 extends ParentExample1{

	static{
		System.out.println("3");
	}
	
	{
		System.out.println("4");
	}
	
	public ChildExample1() {
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		ParentExample1 childExample1 = new ChildExample1();
		ChildExample1 childExample2 = new ChildExample1();
	}
}
