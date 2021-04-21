////Inheritance-Child Class

package sourabh.Assignment27InheritanceExample;

public class B extends A {
	int y= 30;
	int z= 40;
	void m2() {
		System.out.println("Calling B m2.");
	}
	void m3() {
		System.out.println("Calling B m3.");
	}
/*	public static void main(String[] args) {
		//----------------------------Case1--------------------------	
			A a=new A();
			System.out.println(a.x);
			System.out.println(a.y);
			//System.out.println(a.z);//[Reason: Class A doesn't have Z variable]
			a.m1();
		}*/
}
