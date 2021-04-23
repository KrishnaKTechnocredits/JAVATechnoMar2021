package krishna.Assignment_27;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("--------------Case #1----------------------");
		// CASE 1:
		Parent parent = new Parent();
		System.out.println(parent.x); //10
		System.out.println(parent.y); //12
		//System.out.println(parent.z); //Compile error z is not present in parent class
		parent.m1(); //A m1
		parent.m2(); //A m2
		//parent.m3(); //Compile error m3() is is not present in Parent class

		/*System.out.println("--------------Case #2----------------------");
		// CASE 2:
		Child child = new Child();
		System.out.println(child.x); //10
		System.out.println(child.y); //30
		System.out.println(child.z); //40
		child.m1(); //A m1
		child.m2(); // B m2
		child.m3(); //B m3*/

		/*System.out.println("--------------Case #3----------------------");
		// CASE 3: Dynamic Polymorphism
		Parent parent = new Child();
		System.out.println(parent.x); //10
		System.out.println(parent.y); //12
		//System.out.println(parent.z); //Compile error z is not present in parent class
		parent.m1(); //A m1
		parent.m2(); // B m2
		//parent.m3(); //CE m3() is undefined for the type Parent*/
			
		/*System.out.println("--------------Case #4----------------------");
		// CASE 4: Dynamic Polymorphism
		Child child = new Parent(); //compile error due to Type mismatch. It Cannot convert from Parent to child.
		System.out.println(child.x); 
		System.out.println(child.y); 
		System.out.println(child.z); 
		child.m1(); 
		child.m2(); 
		child.m3(); */

		/*System.out.println("--------------Case #5----------------------");
		// CASE 05: 
		//Parent parent = new Parent();
		//Child child = new Child();
		//parent = child; It will act as case 3
		Parent parent = new Child();
		System.out.println(parent.x); //10
		System.out.println(parent.y); //12
		System.out.println(parent.z); //Compile error z is not present in parent class
		parent.m1(); //A m1
		parent.m2(); // B m2
		parent.m3(); //CE m3() is undefined for the type Parent*/
	
		/*System.out.println("--------------Case #6----------------------");
		//CASE 06: 
		Parent parent = new Parent();
		Parent child = new Child();
		child = parent;
		//Parent child = new Parent(); shortcut 
		System.out.println(child.x); //10
		System.out.println(child.y); //12
		System.out.println(child.z); //CE z cannot be resolved 
		child.m1(); //A m1
		child.m2(); // A m2
		child.m3(); //CE m3() is undefined for the type Parent*/
	
		/*System.out.println("--------------Case #7----------------------");
		//CASE 07: 
		Child child1 = new Parent();//compile error due to Type mismatch. It Cannot convert from Parent to child.
		Child child2 = new Child();
		child1 = child2;
		System.out.println(child1.x); 
		System.out.println(child1.y); 
		System.out.println(child1.z); 
		child1.m1(); 
		child1.m2(); 
		child1.m3(); 	*/
	}
}
