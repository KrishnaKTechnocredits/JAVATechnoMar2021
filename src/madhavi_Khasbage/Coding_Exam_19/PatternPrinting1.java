package madhavi_Khasbage.Coding_Exam_19;
/*G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T
*/

public class PatternPrinting1 {
	
	void printPattern() {
		String my_str="GLOBANT";		
		for (int index = 0; index <= my_str.length(); index++) {
			for (int index1 = 0; index1 < index; index1++) {
				char ch= my_str.charAt(index1);
				System.out.print(ch + " ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		PatternPrinting1 objPattern= new PatternPrinting1();
		objPattern.printPattern();
	}

}
