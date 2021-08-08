package gauravk.Assignment_18;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 18 : 14th April'2021
Program 3: write a method which will print ascii value of A to Z.
 */
public class AsciiValueA2Z {
	void displayAsciiOfA2Z() {
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("Ascii of "+ch+ " is "+(int)ch);
		}
	}
	
	public static void main(String[] a) {
		new AsciiValueA2Z().displayAsciiOfA2Z();
	}

}
