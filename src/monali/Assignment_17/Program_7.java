package monali.Assignment_17;

import java.util.Scanner;

public class Program_7 {
	
	int minNumber(int[] array) {
		int minnum = array[0];
		 for(int index=0;index<array.length;index++) {
			 if (array[index] < minnum)
			  minnum = array[index];
		 }
		  System.out.println("maximum number is "+minnum);
		  return minnum;
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
	 			Program_7 program = new Program_7();
	 			program.minNumber(array);
	 	}

	 }
	 		
