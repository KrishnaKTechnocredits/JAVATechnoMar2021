package monali.Assignment_17;

import java.util.Scanner;

public class Program_1 {
	 
	
	int evencount; 
	 
	void evenAndOddCount(int[] num) { 
	 for(int index=0;index<num.length;index++) {
		   if(num[index]%2 == 0);
		   evencount++;
		  }
	    int oddcount1 = num.length - evencount;
	    System.out.println("even count are "+evencount);
	    System.out.println("Odd count are "+oddcount1);
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
	  Program_1 program = new Program_1();
	  program.evenAndOddCount(num);
	
}
}
	    
		

