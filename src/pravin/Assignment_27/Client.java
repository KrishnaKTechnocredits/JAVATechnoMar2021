package pravin.Assignment_27;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("===============Case 01===================");
		// CASE 01:
		Parent parent = new Parent();
		System.out.println(parent.x); //10
		System.out.println(parent.y); //12
		// System.out.println(parent.z); //CE z cannot be resolved
		parent.m1(); //A m1
		parent.m2(); //A m2
		// parent.m3(); //CE m3() is undefined for the type Parent
		
		System.out.println("=================Case 02===================");
		// CASE 02:
		Child child = new Child();
		System.out.println(child.x); //10
		System.out.println(child.y); //30
		System.out.println(child.z); //40
		child.m1(); //A m1
		child.m2(); // B m2
		child.m3(); //B m3
		
		/*System.out.println("===========Case 03==============");
		// CASE 03: Dynamic Polymorphism
		Parent parent = new Child();
		System.out.println(parent.x); //10
		System.out.println(parent.y); //12
		//System.out.println(parent.z); //CE z cannot be resolved
		parent.m1(); //A m1
		parent.m2(); // B m2
		//parent.m3(); //CE m3() is undefined for the type Parent
*/			
		/*System.out.println("==============Case 04================");
		// CASE 04: Dynamic Polymorphism
		Child child = new Parent(); //CE Type mismatch. Cannot convert from Parent to child
		System.out.println(child.x); 
		System.out.println(child.y); 
		System.out.println(child.z); 
		child.m1(); 
		child.m2(); 
		child.m3(); */
		
		/*System.out.println("==============Case 05====================");
		// CASE 05: 
		Parent parent = new Parent();
		Child child = new Child();
		parent = child;
		System.out.println(parent.x); //10
		System.out.println(parent.y); //12
		//System.out.println(parent.z); //CE z cannot be resolved
		parent.m1(); //A m1
		parent.m2(); // B m2
		//parent.m3(); //CE m3() is undefined for the type Parent
*/	
		/*System.out.println("=============Case 06===============");
		//CASE 06: 
		Parent parent = new Parent();
		Parent child = new Child();
		child = parent;
		System.out.println(child.x); //10
		System.out.println(child.y); //12
		//System.out.println(child.z); //CE z cannot be resolved 
		child.m1(); //A m1
		child.m2(); // A m2
		//child.m3(); //CE m3() is undefined for the type Parent
*/
	
	}
}
