package technocredits.superthisDemo;

public class Test {
	{
		System.out.println("Hi");
	}
	
	{
		System.out.println("Hello");
	}
	
	Test(){
		this(10);
		System.out.println("GM");
	}
	
	Test(int x){
		System.out.println("GF");
	}
	
	Test(String y){
		System.out.println("GN");
	}
	
	public static void main(String[] args) {
		//Test t1 = new Test();
		System.out.println("Hi");
	}
	
}
