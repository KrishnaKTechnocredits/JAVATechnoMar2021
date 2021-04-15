package sandesh.Assignment_4;

public class NumberGame {
	
	void findMaxNumber(int num1, int num2, int num3) {
		if(num1 == num2 && num2 == num3)
			System.out.println("Maximum number could not found, All given numbers are equals");
		else if(num1 > num2 && num1 > num3)
			System.out.println("Maximum number is " + num1);
		else if(num2 > num3)	//elimination logic is used. to find the max number. Keep on eliminating the small numbers. Less comparison so less time complexity.
			System.out.println("Maximum number is " + num2);
		else
			System.out.println("Maximum number is " + num3);
			
	}
	void findMinNumber(int num1, int num2, int num3) {
		if(num1 == num2 && num2 == num3)
			System.out.println("Minimum number could not found, All given numbers are equals");
		else if(num1 < num2 && num1 < num3)
			System.out.println("Minimum number is " + num1);
		else if(num2 < num3)	//elimination logic is used.
			System.out.println("Minimum number is " + num2);
		else
			System.out.println("Minimum number is " + num3);
	}
	
	public static void main(String[] args) {
		NumberGame ng1 = new NumberGame();
		int number1 = 23;
		int number2 = 63;
		int number3 = 80;
		ng1.findMaxNumber(number1, number2, number3);
		ng1.findMinNumber(number1, number2, number3);
	}
}
