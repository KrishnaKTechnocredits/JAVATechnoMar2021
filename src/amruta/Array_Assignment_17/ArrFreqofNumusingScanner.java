
/*
  10th April 21 --- Assignment 17 ---- Program No 4 :
  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */


//  Program using scanner 

package amruta.Array_Assignment_17;


import java.util.Scanner;

public class ArrFreqofNumusingScanner {
	int targetcnt;	int frequencyofnum(int[] arr,int targetnum) {
		for(int index = 0; index < arr.length ; index++){
			
			if(targetnum == arr[index])
				targetcnt++;		}
		return targetcnt;
	}
	
	public static void main(String[] args) {
		int [] arrnum = {11,13,52,13,88,87,13,45,22,13};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target Number : ");
		int input = sc.nextInt();
		
		ArrFreqofNumusingScanner freq = new ArrFreqofNumusingScanner();
			
		System.out.println("Frequency of Number "+input+" in given array is : "+(freq.frequencyofnum(arrnum, input)));
	}
}
