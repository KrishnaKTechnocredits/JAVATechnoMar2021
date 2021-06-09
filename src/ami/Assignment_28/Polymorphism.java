// WAP for polymorphism : multiple cases with priority deciding

package ami.Assignment_28;

public class Polymorphism {
	
	   void area(byte x) {
		System.out.println("byte");
	} 
	 
	  void area(short x) {
		System.out.println("int");
	} 
	
	void area(int x) {
		System.out.println("int "+x);

	} /*
	
	void area(long x) {   // if int not available then it will go to long
		
		System.out.println("long");
	} 
	*/
	void area(float x) {  // if long not available then it will go to float
		System.out.println("float");	
	} 
/*
	void area(double x) { // If Float not available then it will go to double
		System.out.println("double");
	} */
	
	void area(String str) {
		System.out.println("String");
	} 
	
	/*void area(char ch) {
		System.out.println("Character");
	} */

	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		//polymorphism.area(1);
		//polymorphism.area("ABCD");
		polymorphism.area('A');  // If method with character variable not available then it will go to intiger and consider ascii value
	}
}

/*
 Sequence of priority
 Byte --> Short --> Int --> long --> float --> double 
 for character if character method not available then 
 character will use method with integer and convert it into ascii value.
 */
