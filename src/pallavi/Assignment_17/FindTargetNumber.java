package pallavi.Assignment_17;

import java.util.Scanner;

/*return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.
*/
public class FindTargetNumber {
	
	boolean isNumberPresent(int[] arr,int target){
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==target)
				return true;
				}
		
		return false;
	}

	public static void main(String[] args) {

		int[] array= {10,23,23,44,23,10,23,4,23};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter target number");
		int target = sc.nextInt();
		sc.close();
		boolean ans=new FindTargetNumber().isNumberPresent(array, target);
		if(ans==true) {
			System.out.println( target + " is present");}
			else
			System.out.println("Number " +target+ " doesn't found in given array");
		}
		
	}


