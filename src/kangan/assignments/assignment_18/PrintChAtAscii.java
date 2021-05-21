package kangan.assignments.assignment_18;

public class PrintChAtAscii {
	
	void getCharAtAscii() {
		for(int index=65;index<=122;index++) {
			
			System.out.println(" Character at " + index  + "  =  "  + (char)index);  
		}	
	}
	public static void main(String[] args) {
		PrintChAtAscii printChAtAscii = new PrintChAtAscii();
		printChAtAscii.getCharAtAscii();
	}
}
