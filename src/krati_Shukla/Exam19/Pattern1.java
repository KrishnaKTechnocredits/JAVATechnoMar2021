/*Program 1 - Print below pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T*/

package krati_Shukla.Exam19;

public class Pattern1 {
	
	void PrintPattern(String input) {
		int length = input.length();
		String temp = "";
		for(int index=0; index<length; index++) {
			for(int innerIndex=0; innerIndex<=index; innerIndex++) {
				System.out.print(input.charAt(innerIndex)+" ");
			}	
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Pattern1 pattern = new Pattern1();
		pattern.PrintPattern("GLOBANT");
	}

}
