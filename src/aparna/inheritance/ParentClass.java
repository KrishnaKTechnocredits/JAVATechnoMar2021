/*Inheritance related all 7 Cases when Parent and Child class 
 * both are present into same package
 * 
 */
package aparna.inheritance;

public class ParentClass {
	int x = 10;
	int y = 12;

	public void m1() {
		System.out.println("Class parent m1 Method");
	}

	public void m2() {
		System.out.println("Class parent m2 Method");
	}

	public String m3() {
		System.out.println("Class Parent's m3 method whose return type is String");
		return "Returns String from Method m3 of Class Parent";
	}
}
