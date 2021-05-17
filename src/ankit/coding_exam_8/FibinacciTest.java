package ankit.coding_exam_8;

public class FibinacciTest {

	void printFibinacciSeries(int reqNums){
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
				
		for(int i = 0 ;i < reqNums-2;i++) {
			if(i==0) {
				System.out.print(num1 + " ");
				System.out.print(num2 + " ");
			}
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;	
		}	
	}
	
	public static void main(String[] args) {
			new FibinacciTest().printFibinacciSeries(8);		
	}
}





