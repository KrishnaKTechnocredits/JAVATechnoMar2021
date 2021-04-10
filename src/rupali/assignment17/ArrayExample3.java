/*
 *    
Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
		 
		 

 */
package rupali.assignment17;

import java.util.Scanner;
public class ArrayExample3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the legnth of Array");
		int l=s.nextInt();
		System.out.println("Enetr the intgers for array");
		int[] number= new int[l];
		for(int i=0;i<number.length;i++) 
			number[i]=s.nextInt();
		
		new ArrayExample3().countpositivenegative(number);
		
	}
	
	void countpositivenegative(int[] num) {
		int negativecount=0,positivecount=0;
		for (int index=0;index<num.length;index++) {
			if(num[index]<0)
				negativecount++;
			else
				positivecount++;
		}
		System.out.println("Positive numbers in given array is :"+positivecount);
		System.out.println("Negative numbers in given array is :"+negativecount);
		
		}
	}


