package technocredits.arrayDemo;

public class Example2 {

	void printEvenNumbers(int[] input) {
		for(int index=0;index<input.length;index++) {
			if(input[index] % 2 == 0)
				System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		int[] num = {10,23,26,27,88,87,65};
		//int[] arr = 10;
		int temp = 100;
		String input = "Hi";
		new Example2().printEvenNumbers(num);
		
	}
}
