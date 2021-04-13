/*
 * Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}

 */
package rupali.assignment17;

import java.util.Scanner;

public class ArrayExample2 {
	void diffEvenOddsum() {
		int evensum=0,oddsum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the legnth of Array");
		int l=s.nextInt();
		System.out.println("Enetr the intgers for array");
		int[] array= new int[l];
		for(int i=0;i<array.length;i++) 
			array[i]=s.nextInt();
					
		for(int index=0;index<array.length;index++) {
			if( array[index]%2==0 )
				evensum=evensum+array[index];
			else
				oddsum=oddsum+array[index];
		}
		System.out.println("Even nos sum: "+evensum+" Odd nos sum="+oddsum);
		System.out.println("Diffrence between evensum n oddsum= ");
		if(evensum>oddsum)
			System.out.println((evensum-oddsum));
		else
			System.out.println((oddsum-evensum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ArrayExample2().diffEvenOddsum();
	}
}
