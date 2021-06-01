package paras.NonStatic_Block_Examples;

public class Child extends Parent{
	
	{
		System.out.println("Child Block");
	}
	
	Child(){
		System.out.println("Child Default");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
	}
}
