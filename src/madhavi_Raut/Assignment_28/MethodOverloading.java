package madhavi_Raut.Assignment_28;

public class MethodOverloading {

	void m1(byte b) {
		System.out.println("1 - byte");
	}

	void m1(short s) {
		System.out.println("2 - short");
	}

	/*void m1(int i) {
		System.out.println("3 - int");
	}*/

	/*void m1(long l) {
		System.out.println("4 - long");
	}*/

	/*void m1(float f) {
		System.out.println("5 - float");
	}*/

	/*void m1(double d) {
		System.out.println("6 - double");
	}*/

	void m1(String s) {
		System.out.println("7 - String");
	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		//methodOverloading.m1(10); // 3 - int
		//methodOverloading.m1(10); //4 - long (on commenting m1(int i))
		//methodOverloading.m1(10); //5 - float (on commenting m1(int i) and m1(long l)
		//methodOverloading.m1(10);// 6 - double(on commenting m1(int i), m1(long l) and m1(float f)
		//methodOverloading.m1(10);// CE -"The method m1(byte) in the type MethodOverloading is not applicable for the arguments (int)" ((on commenting m1(int i), m1(long l), m1(float f) and m1(double d) )
		methodOverloading.m1((byte)10); // 1 - byte (on down-casting to byte)
		methodOverloading.m1((short)10); // 2 - short (on down casting to short)
		//methodOverloading.m1((String)10); // CE Cannot cast from int to String
	}
}
