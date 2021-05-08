package kapil.InheritanceAssi27;

public class Child extends Parents {

	int y = 30;
	int z = 40;

	void getM2() {
		System.out.println("child m2");

	}

	void getM3() {
		System.out.println("Child M3");
	}

	public static void main(String[] args) {
		System.out.println("Case 1");
		Parents parent = new Parents();
		System.out.println(parent.x);
		System.out.println(parent.y);
		//System.out.println(parent.z);
		parent.getM1();
		parent.getM2();
		//parent.getM3();
		
	    System.out.println("----------------------------------");
        System.out.println("Case 2");
		Child child = new Child();
		System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);
		child.getM1();
		child.getM2();
		child.getM3();
		
		System.out.println("---------------------------------");
		System.out.println("Case 3   dynamic polymorphism");
		Parents parent1 = new Child();
		System.out.println(parent1.x);
		System.out.println(parent1.y);
		//System.out.println(parent1.z);
		parent1.getM1();
		parent1.getM2();
		//parent1.getM3();
		
		 System.out.println("----------------------------------");
	        System.out.println("Case 4 does not show parents Behaviour in object");
			//Child child1 = new Parents();
			//System.out.println(child1.x);
			//System.out.println(child1.y);
			//System.out.println(child1.z);
			//child1.getM1();
			//child1.getM2();
			//child1.getM3();
			
			System.out.println("----------------------------------");
			System.out.println("Case 5");
			Parents parent2 = new Parents();
			Child child2 = new Child();
			parent2=child2;
			System.out.println(parent2.x);
			System.out.println(parent2.y);
			//System.out.println(parent.z);
			parent2.getM1();
			parent2.getM2();
			//parent2.getM3();
			
			System.out.println("----------------------------------");
			System.out.println("Case 6");
			Parents parent3 = new Parents();
			Parents child3= new Child();	
			child3 = parent3;
			System.out.println(child3.x);
			System.out.println(child3.y);
			//System.out.println(child3.z);
			child3.getM1();
			child3.getM2();
			//child3.getM3();
			
			
			System.out.println("----------------------------------");
			System.out.println("Case 7 does not show parents behaviour in object");
			//Child child4 = new Parents();
			//Child child5 = new Child();
			//child4=child5;
	}
}