package prachi.Coding_Exam_8;

public class Fibonacci_Series {

	void getFibonaciiSeries() {
		int prev=0;
		int next=1;
		System.out.print(prev+ " " +next);
		
		int numberOfElements = 8;
		int sum = 0;
		 
		for(int i=2; i<numberOfElements; i++) {
			sum = prev+next;
			System.out.print(" "+sum);
			prev=next;
			next=sum;
		}
	}
	public static void main(String[] args) {
		Fibonacci_Series fs = new Fibonacci_Series();
		System.out.println("Fibonacci series for upto 8 numbers is as follows: ");
		fs.getFibonaciiSeries();
	}
}
