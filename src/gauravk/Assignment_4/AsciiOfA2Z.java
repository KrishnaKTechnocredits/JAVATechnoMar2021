package gauravk.Assignment_4;
/*#4
 * Program 3:  write a method which will print ascii value of A to Z.
 */
public class AsciiOfA2Z {
	
	void printAsci() {
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch+" = "+(int)ch);
		}
	}
	
	public static void main(String[] a) {
		AsciiOfA2Z asciiOfA2Z1 = new AsciiOfA2Z();
		asciiOfA2Z1.printAsci();
	}
}
