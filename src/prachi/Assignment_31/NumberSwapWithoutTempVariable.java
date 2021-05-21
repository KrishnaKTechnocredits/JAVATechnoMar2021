package prachi.Assignment_31;

public class NumberSwapWithoutTempVariable {

	static void withoutTempVariable(){
		int x=10;
		int y=20;
		
		x = x + y; //30
        y = x - y; //30-20=10
        x = x - y; //30-10=20

		System.out.println("Swapped value of x without using temp variable is: "+x);
		System.out.println("Swapped value of y without using temp variable is: "+y);
	}
	
	public static void main(String[] args) {
		withoutTempVariable();
	}
}
