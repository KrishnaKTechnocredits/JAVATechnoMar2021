package madhavi_Raut.CodingExam.Exam_08;
/*Program 2: Print Fibonacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 */
public class FindFibonacciSeries {

	void displayFibonacciSeries(int length) {
		System.out.println("Below is the Fibonacci series upto 8 numbers:");
		int num1 = 0;
		int num2 = 1;
		int temp = 0, count = 0;
		System.out.print(num1 + " ");
		while (count <= length-2) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(num1 + " ");
			count++;
		}
	}

	public static void main(String[] args) {		
		new FindFibonacciSeries().displayFibonacciSeries(8);
	}
}
