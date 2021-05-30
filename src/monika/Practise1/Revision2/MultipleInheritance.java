package monika.Practise1.Revision2;

import monika.Practise1.Revision.Accessmodifer_Testing;

public class MultipleInheritance extends Accessmodifer_Testing {

/*	private static String ReplaceInts(String str) {
		boolean wasLastCharNumber = false;

		StringBuilder finalstr = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (!wasLastCharNumber)
					finalstr.append("*");
				else
				//	str.replace(i, 1);
				str.replace(str.charAt(i), '1');
				wasLastCharNumber = true;
			} else {
				finalstr.append(str.charAt(i));
				wasLastCharNumber = false;
			}
		}
		return finalstr.toString();
	}*/
	protected int m1(int x){
		System.out.println("child class m1");
	return 1;	
	}
	
	void m3() {
		 int x = 10;
		m1();
		m2();
		Accessmodifer_Testing.m2();
	}

	public static void main(String[] args) {
		
		 MultipleInheritance childObject = new MultipleInheritance();
		 childObject.m1(); //non static method
		 childObject.m1(1001);
		// childObject.m2(); // static method - it works
		// System.out.println("****");
		// childObject.m3(); // it works 
		// m1();
		//childObject
		 
		 Accessmodifer_Testing t1 = new Accessmodifer_Testing();
		 t1.m2(); //Jai
		 
		// t1.m1();
		 
		 /*System.out.println(m2()); // //static method can call directly
		 
		 Accessmodifer_Testing.m2();
		 
		  Accessmodifer_Testing parentObject = childObject; MultipleInheritance
		  childObject1 = (MultipleInheritance) parentObject; System.out.println("Hi");
		  Accessmodifer_Testing s = new Accessmodifer_Testing(); MultipleInheritance
		  childObject2 = (MultipleInheritance)s; System.out.println("Hello");*/
		  
		  
		 

		// String s = ReplaceInts("I will eat 2 burgers 23 fries & 1.25 cokes l8r");
		//System.out.println(s);

	}

}
