/*
Program 2-Print pattern
G L O B A N T
G L O B A N
G L O B A
G L O B 
G L O
G L 
G
 */
package radha.CodingTest19;

public class PatternProgram2 {
	
	void revPattern(String str) {
		for(int row=0;row<str.length();row++) {
			for(int column=0;column<str.length()-row;column++) {
				System.out.print(str.charAt(column)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternProgram2 pat = new PatternProgram2();
		pat.revPattern("GLOBANT");
	}

}
