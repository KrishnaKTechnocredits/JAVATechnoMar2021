package technocredits.superthisDemo;

public class Parent {

	{
		System.out.println("Parent Block");
	}
	
	Parent(){
		this(10);
		System.out.println("Parent Default");
	}
	
	Parent(int x){
		super();
		System.out.println("HI");
	}
	
}
