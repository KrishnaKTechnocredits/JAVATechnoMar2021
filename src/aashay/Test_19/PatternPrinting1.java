package aashay.Test_19;
/*
 * Coding_Exam_19

Program 1 - Print below pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T

Program 2 - Print below pattern
G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G

 */

public class PatternPrinting1 {
	
	
	public static void globantPrint(String input) {
		for(int index =0; index < input.length();index++) {
			for(int innerIndex=0; innerIndex <= index;innerIndex++) {
				System.out.print(input.charAt(innerIndex)+" ");				
			}
			System.out.println();
		}
		
	}
	
	public static void globantReversePrint(String input) {
		for(int index = 0; index < input.length(); index++) {
			for(int innerIndex = 0; innerIndex < input.length() - index; innerIndex++) {
				System.out.print(input.charAt(innerIndex)+" ");
			}
			System.out.println(); 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "globant";
		PatternPrinting1.globantPrint(input);
		System.out.println();
		PatternPrinting1.globantReversePrint(input);
		

	}

}
