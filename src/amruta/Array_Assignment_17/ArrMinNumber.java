/*  10th April 21 --- Assignment 17 ---- Program No 7 :
 From given array return min number.
input : 22,35,65,88,11,23,95
output : 88
 */

package amruta.Array_Assignment_17;

public class ArrMinNumber {
	
	// -----With return Type ----//
	
	int printminnumber(int[] arr) {
		 int min = arr[0];
		for (int index = 1 ; index < arr.length ; index++) {
			if(arr[index] < min){
				min =  arr[index];
			}		
		}
		return min;
	}
	
	// -----Without return Type ----//
	
	void printMinNum(int[] arr) {
		 int min = arr[0];
		for (int index = 1 ; index < arr.length ; index++) {
			if(arr[index] < min){
				min =  arr[index];
			}		
		}
		System.out.println("Minimum Number is :"+ min);
	}
	
	
	public static void main(String[] args) {
		int[] num = {22,35,65,88,11,23,95};
		
		int minimumnumber = new ArrMinNumber().printminnumber(num);
		System.out.println("Minimum Number is :"+ minimumnumber);
		
		System.out.println("----------------------------------------------");
		new ArrMinNumber().printMinNum(num);
		
		//ArrMinNumber mini = new ArrMinNumber();
		//mini.printMinNum(num);
	}
}


