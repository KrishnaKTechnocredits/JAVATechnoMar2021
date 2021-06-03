/*Program 2 - Print below pattern
G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G*/

package krati_Shukla.Exam19;

public class Pattern2 {

	void PrintPattern(String input) {
		int length = input.length();
		
		for(int index=0; index<length; index++) {
			int i=0;
			for(int innerIndex=length-1; innerIndex>=index; innerIndex--) {
				 System.out.print(input.charAt(i)+" ");
				 i = i+1;
			}	
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Pattern2 pattern = new Pattern2();
		pattern.PrintPattern("GLOBANT");
	}

}
