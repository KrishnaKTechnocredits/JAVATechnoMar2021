package monika.Practise1.Revision;

import monika.Practise1.Revision2.FirstInterface;

public class ExtraInheritInterface extends ExtraTest1 implements FirstInterface{
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println(InheritInterface.y);
		ExtraInheritInterface obj = new ExtraInheritInterface();
		FirstInterface.sub(); // static - inetrface
		ExtraInheritInterface.sub();
		obj.mul(); // abstract
		obj.sum(); // abst
		
		//obj.sub();//interface
		//System.out.println(obj.y);
	}

	@Override
	public void sum() {
		System.out.println("Class sum method");
	}

	public static void sub() {
		System.out.println("Class sub method");
	}

	@Override
	public void mul() {
		System.out.println("class mul method");
	}

}
