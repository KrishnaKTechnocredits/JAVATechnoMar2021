package kangan.assignments.assignment_18;

public class PrintAsciiValue {

	void getAsciiValue() {
		for(int index=65;index<=122;index++) {
			
			System.out.println(" The ASCII value of " + (char)index + "  =  " + index);  
		}	
	}
	public static void main(String[] args) {
		PrintAsciiValue printAsciiValue = new PrintAsciiValue();
		printAsciiValue.getAsciiValue();
	}
	
}
