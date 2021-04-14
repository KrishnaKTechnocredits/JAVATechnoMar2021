package monali.Assignment_17;

import java.util.Scanner;

public class Program_6 {
	
	
	int maxNumber(int[] array) {
		int  maxnum = array[0] ;
		 for(int index=1;index<array.length;index++) {
			if(array[index]>maxnum)
			maxnum = array[index];
		 }
		  System.out.println("maximum number is "+maxnum);
            return maxnum ;
	}
	
	     public static void main(String[] a) {
	 		Scanner scanner = new Scanner(System.in);
	 		 System.out.println("Enter size");
	 			int size = scanner.nextInt();
	 		    int[] array = new int[size];
	 			for(int index=0;index<array.length;index++) {
	 				 System.out.println("Enter numbers");
	 			     array[index] = scanner.nextInt();
	 			}
	 			Program_6 program = new Program_6();
	 			program.maxNumber(array);
	 	}

	 }
	 		 




