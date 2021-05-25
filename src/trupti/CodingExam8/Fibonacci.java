package trupti.CodingExam8;

public class Fibonacci {
	void printFibonacci(int numOfElement) {
		int firstElement=0;
		int tempElement = 1;
		int sum;
		sum = firstElement + tempElement;
		System.out.print(firstElement + " "+tempElement + " "+sum+ " ");
		for(int i = 0; i<numOfElement-3; i++) {
			int tempSum = sum;
			sum +=tempElement;
			tempElement = tempSum;
			System.out.print(sum + " ");
		}
	}
	

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.printFibonacci(8);

	}

}
