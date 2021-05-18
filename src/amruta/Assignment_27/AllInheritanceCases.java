package amruta.Assignment_27;

public class AllInheritanceCases{

	public static void main(String[] args) {
	// CASE : 1
		System.out.println("\n...................CASE 1........................\n");
		Aparent a = new Aparent();
		
		System.out.println("Value of X : "+ a.x);
		System.out.println("Value of Y : "+ a.y);
	//	System.out.println("Value of Y : "+ a.z); // Parent(A) class cannot access property of Child(B) Class
		a.m1();
		a.m2();
	//	a.m3();	// m3() method is not in parent class (A)
		
	// CASE : 2
		System.out.println("\n...................CASE 2........................\n");
		Bchild b = new Bchild();
		
		System.out.println("Value of X : "+ b.x); 	// Bchild dont have variable x so it will inherit from class Aparent.
		System.out.println("Value of Y : "+ b.y);
		System.out.println("Value of Z : "+ b.z); 
		b.m1();
		b.m2();		// Class Bchild having its own m2() method --> it will not take m2() from class Aparent
		b.m3();	
		
	// CASE : 3
		System.out.println("\n...................CASE 3 (Dynamic Polymorphism)........................\n");
		Aparent a1 = new Bchild();
		
		System.out.println("Value of X : "+ a1.x);
		System.out.println("Value of Y : "+ a1.y); 		//Properties will not change at Run Time so it will give value of X from Aparent class
	//	System.out.println("Value of Y : "+ a1.z); 	// Parent(A) class cannot access property of Child(B) Class
		a1.m1();
		a1.m2();	// At Run time it will execute behavior of Bchild class ---> it will execute m2() method of Bchild class
	//	a.m3();	// m3() method is not in parent class (A)
		
	// CASE : 4
		System.out.println("\n...................CASE 4........................\n");

		System.out.println("Bchild ar = new Aparent(); \n Trying to assign object of Aparent class in Bchild class \n ----> This will not work, It Require External TypeCasting here...");
	//	Bchild ar = new Aparent(); 
		
	// CASE : 5
		System.out.println("\n...................CASE 5........................\n");
		
		Aparent a2 = new Aparent();
		Bchild b2 = new Bchild();
		a2 = b2;	
		System.out.println("Aparent a2 = new Aparent();\r\n" + "Bchild b2 = new Bchild();");
		System.out.println("a2 = b2 : Assign all the values of b2 to a1 \n---> AND it will turn to ---> Aparent a2 = new Bchild(); i.e CASE:3 \n");

		System.out.println("Value of X : "+ a1.x);
		System.out.println("Value of Y : "+ a1.y); 		//Properties will not change at Run Time so it will give value of X from Aparent class
	//	System.out.println("Value of Y : "+ a1.z); 	// Parent(A) class cannot access property of Child(B) Class
		a1.m1();
		a1.m2();	// At Run time it will execute behavior of Bchild class ---> it will execute m2() method of Bchild class
	//	a.m3();	// m3() method is not in parent class (A)
		
	// CASE : 6
		System.out.println("\n...................CASE 6........................\n");
		
		Aparent a3 = new Aparent();
		Aparent b3 = new Bchild();
		b3 = a3;	
		System.out.println("Aparent a3 = new Aparent();\r\n" + "Aparent b3 = new Bchild();");
		System.out.println(" a3 = a3 : Assign all the values of a3 to b3 \n---> AND it will turn to ---> Aparent b3 = new Aparent(); i.e CASE:1 \n");
		
		System.out.println("Value of X : "+ a.x);
		System.out.println("Value of Y : "+ a.y);
	//	System.out.println("Value of Y : "+ a.z); // Parent(A) class cannot access property of Child(B) Class
		a.m1();
		a.m2();
	//	a.m3();	// m3() method is not in parent class (A)
		
	// CASE : 7
		System.out.println("\n...................CASE 7........................\n");
		
		System.out.println("Bchild b4 = new Aparent(); *<--- \r\n" + "Bchild b5 = new Bchild(); \n"+"b4 = b5 \n"+ "\nAgain Trying to assign object of Aparent class in Bchild class \n ----> This will not work, It Require External TypeCasting here...\"");
	/*	Bchild b4 = new Aparent();
		Bchild b5 = new Bchild();
		b4 = b5;  */
	}
}