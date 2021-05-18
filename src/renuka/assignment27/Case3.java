package renuka.assignment27;

public class Case3 {

	public static void main(String[] args) {
		//DYNAMIC POLYMORPHISM
				A a1 = new B();
				System.out.println(a1.x);
				//10
				System.out.println(a1.y);
				//12
				//System.out.println(a1.z);--- CE A don't have variable z
				a1.m1();
				//A m1
				a1.m2();
				//B m2
				//a1.m3();--- CE A don't have method m3()

	}

}
