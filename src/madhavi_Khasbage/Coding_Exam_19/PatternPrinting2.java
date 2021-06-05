package madhavi_Khasbage.Coding_Exam_19;
/*G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G*/
public class PatternPrinting2 {
	void printPattern() {
		String my_str="GLOBANT";	
		int length=my_str.length();
		for (int index = 0; index <= my_str.length(); index++) {
			for (int index1 = 0; index1 < length; index1++) {
				char ch= my_str.charAt(index1);
				System.out.print(ch + " ");
			}
			length--;
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		PatternPrinting2 objPattern= new PatternPrinting2();
		objPattern.printPattern();
	}

}
