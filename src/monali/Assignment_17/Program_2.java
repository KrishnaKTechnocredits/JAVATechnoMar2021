package monali.Assignment_17;

import java.util.Scanner;

public class Program_2 {
	
    int evensum;
	int oddsum;
	void differenceOfEvenAndOddCount(int[] array) {
		 for(int index=0;index<array.length;index++) {
			   if(array[index]%2 == 0)
			    evensum = evensum + array[index];
			    else
			    	oddsum = oddsum + array[index];
			  }
	}
	       int diffOfEvenAndOddCount() {
		    int Answer = evensum - oddsum;
		   System.out.println("diff of even and odd count is "+Answer);
		    return Answer;
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
		  Program_2 program = new Program_2();
		  program.differenceOfEvenAndOddCount(num);
		  program.diffOfEvenAndOddCount();
		}
		
	}
		
	