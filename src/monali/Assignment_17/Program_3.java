package monali.Assignment_17;

import java.util.Scanner;

public class Program_3 {
	
	int positivecount;
	int negativecount;
	
	void countPositiveAndNegativeNumber(int[] array) {
		for(int index=0;index<array.length;index++) {
		 if (array[index] >= 0)
          positivecount++; 
		 else
		negativecount++; 
		 }
		System.out.println("positive count is"+positivecount);
		System.out.println("negavite count is"+negativecount);
}
	
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
	    int[] num = new int[size];
		for(int index=0;index<num.length;index++) {
			 System.out.println("Enter numbers");
		     num[index] = scanner.nextInt();
		}
	     Program_3 number = new Program_3();
	     number.countPositiveAndNegativeNumber(num);
	     
}
}



