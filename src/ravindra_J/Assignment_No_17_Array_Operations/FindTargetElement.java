/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  
*/
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class FindTargetElement {
static int size,target;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an Array");
		size = scanner.nextInt();

		int[] input = new int[size];

		for(int index=0;index<size;index++) {
			System.out.println("Enter the "+size+" elements of an array");
			input[index]= scanner.nextInt();
			}
		
		System.out.println("Enter the target");
		target = scanner.nextInt();
		
		FindTargetElement Findtargettlement = new FindTargetElement();

		boolean flag = Findtargettlement.isNumberPresent(input, size, target);
		System.out.println(flag);
	}

	boolean isNumberPresent(int []input, int size, int target) {
			boolean flag1=false, flag2 = false;
			for(int i = 0;i<size;i++) {
				if(input[i]==target)
					flag1 = true;
				else
					flag2 = false;
			}
			if(flag1 == true)
				return flag1;
			else
				return flag2;
	}

}
