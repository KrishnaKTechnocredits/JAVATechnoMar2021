package prachi.Assignment_28;

public class Method_Overloading {
	/*void method(byte b) {
		System.out.println("Method_1_byte");
	}

	void method(short s) {
		System.out.println("Method_2_short");
	}
	 
	void method(int i) {
		System.out.println("Method_3_int");
	}*/

	void method(long l) {
		System.out.println("Method_4_long");
	}

	/*void method(float f) {
		System.out.println("Method_5_float");
	}

	void method(double d) {
		System.out.println("Method_6_double");
	}*/

	void method(String s) {
		System.out.println("Method_7_String");
	}

	//will consider long, on commenting m1(int i))
	//will consider long, on commenting m1(int i) and m1(long l)
	//will consider double,on commenting m1(int i), m1(long l) and m1(float f)
	public static void main(String[] args) {
		Method_Overloading methodOverloading = new Method_Overloading();
		//methodOverloading.method(10); // CE as 10 is whole int num and cannot be defined as byte.
		//methodOverloading.method(10); 
		//methodOverloading.method(10);  
		methodOverloading.method(10); 
		//methodOverloading.method(10);// CE if all above methods made commented.
		//methodOverloading.method((byte)10); // downcasting to byte
		//methodOverloading.method((short)10); // downcasting to short
		//methodOverloading.method((String)10); // CE as int to String cating is not possible
		methodOverloading.method("test");
	}
}
