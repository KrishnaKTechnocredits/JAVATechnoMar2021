/* Assignment 30 - WAP to find Second max from given array

int[] arr = {10,33,43,55,97,11,3};

ouput : 55   */

package amruta.Assignment_29_to_32;

public class FindSecondMaxNumfromArray {
	
	
	void getMaxNum(int[] arr) {
		
		int maxnum = arr[0];
		int secondmax = 0;
		
		for(int index=1;  index<  arr.length ; index++) {
			
				
				if(arr[index] > maxnum) {
					
					secondmax = maxnum;
					maxnum = arr[index];
					
				}else if(arr[index] > secondmax) {
					secondmax = arr[index];
				}
		}
		System.out.println("Second Maximum Number is : "+secondmax);

	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,33,43,55,97,66,3};
		
		new FindSecondMaxNumfromArray().getMaxNum(arr);
	}

}
