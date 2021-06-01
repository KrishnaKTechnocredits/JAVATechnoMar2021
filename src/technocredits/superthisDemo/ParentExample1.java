package technocredits.superthisDemo;

public class ParentExample1 {

	static{
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	public ParentExample1() {
		System.out.println("6");
	}
}
