/*
Test 19: Print pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T
 */
package radha.CodingTest19;

public class PatternProgram1 {
	
	void pattern(String str) {
		for(int row=0;row<str.length();row++) {
			for(int column=0;column<=row;column++) {
				System.out.print(str.charAt(column)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram1 patrn = new PatternProgram1();
		patrn.pattern("GLOBANT");
	}

}
