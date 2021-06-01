package renuka.exam8;

/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13*/ 

public class FibonacciSeries {
	
	
	void fibonacci(int num) {
		int firstNum = 0;
		int secondNum = 1;
		System.out.println("Series is: " + firstNum);
		System.out.println("Series is: " + secondNum);
		
		for(int index = 0; index < num-2 ; index++) {
			//System.out.println("Series is: " + firstNum);
			int temp = firstNum + secondNum;
			System.out.println("Series is: " + temp);
			firstNum = secondNum;
			secondNum = temp;
			
		}
	}
	
	

	public static void main(String[] args) {
		FibonacciSeries fibonacciseries = new FibonacciSeries();
		fibonacciseries.fibonacci(8);

	}

}
