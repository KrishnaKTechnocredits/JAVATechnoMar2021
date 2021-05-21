package ravindra_J.Assignment_No_27_Inheritance_7_Cases;

public class Child extends Parent {
	int z = 30;
	int y = 40;
	
	void m1(int n) {
		System.out.println("child.m1(n)");
		System.out.println(y); 
	}
	
	//as it is not allowing different method than class A
	 	int m2(String str) { // CE 
			System.out.println("child.m2(str) : "+str);
		return z+b;
	}
	 	void m3() {
	 		System.out.println("child m3()" +b);
	 	}
	 	
}
