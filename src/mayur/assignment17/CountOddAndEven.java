package mayur.assignment17;

public class CountOddAndEven {
	void oddEven(int[] input) {
		int count = 0;
		for(int index = 0; index<input.length;index++) {
			if(input[index]%2==0)
				count++;
		}
		System.out.println("Count of Even numbers is: " +count);
		System.out.println("Count of Odd numbers is: " +(input.length-count));
	}
	
	public static void main(String[] args) {
		CountOddAndEven oe = new CountOddAndEven();
		int[] input = {10,23,26,27,88,87,65};
		oe.oddEven(input);
		}
		
		
		
}
