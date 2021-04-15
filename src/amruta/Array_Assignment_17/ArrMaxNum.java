/*  10th April 21 --- Assignment 17 ---- Program No 6 :
 From given array return max number.
input : 22,35,65,88,11,23,95
output : 88
 */

package amruta.Array_Assignment_17;

// By using return type :


public class ArrMaxNum {
	
	// -----With return Type ----//
	
	int printmaxnumber(int[] arr) {
		 int max = arr[0];
		for (int index = 1 ; index < arr.length ; index++) {
			if(arr[index] > max){
				max =  arr[index];
			}		
		}
		return max;
	}
	
	//---- Without using return type---- //
	
	void printMaxNum(int[] arr) {
		 int max = arr[0];
		for (int index = 1 ; index < arr.length ; index++) {
			if(arr[index] > max){
				max =  arr[index];
			}		
		}
		System.out.println("Maximum Number is : "+ max);
	}
	
	
	public static void main(String[] args) {
		int[] num = {22,35,65,88,11,23,95};
		
		int maximumnumber = new ArrMaxNum().printmaxnumber(num);
		System.out.println("Maximum Number is : "+ maximumnumber);
		
		System.out.println("----------------------------------------------");
		new ArrMaxNum().printMaxNum(num);
	
	}
}
