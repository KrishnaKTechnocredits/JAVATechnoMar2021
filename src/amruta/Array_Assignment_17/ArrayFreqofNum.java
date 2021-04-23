/*
  10th April 21 --- Assignment 17 ---- Program No 4 :
  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */

package amruta.Array_Assignment_17;


//  Program without scanner Direct By passing value 

public class ArrayFreqofNum {
	int targetcnt;
	int frequencyofnum(int[] arr,int targetnum) {
		for(int index = 0; index < arr.length ; index++){
			
			if(targetnum == arr[index])
				targetcnt++;
		}
		return targetcnt;
	}
	
	public static void main(String[] args) {
		int [] arrnum = {11,13,52,13,88,87,13,45,22,13};
		
		ArrayFreqofNum freq = new ArrayFreqofNum();
		freq.frequencyofnum(arrnum, 13);
		System.out.println("Frequency of Number 13 in given array is : "+freq.targetcnt); // accessing instance variable by using object
	}
} 

