/*
Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
output : 55
 */
package paras.Assignment_30;

public class FindSecondMaxFromArr {
	
	void findSecondMax(int [] arr) {
		int maxNumber = arr[0];
		int secondMax = arr[0];
		for(int index = 1; index < arr.length; index++) {
			if(arr[index] > maxNumber) {
				secondMax = maxNumber;
				maxNumber = arr[index];	
			}
		}
		System.out.println("Second max number is: " + secondMax);
	}
	
	public static void main(String[] args) {
		FindSecondMaxFromArr findSecondMaxFromArr = new FindSecondMaxFromArr();
		int [] arr = {10,33,43,55,97,11,3};
		findSecondMaxFromArr.findSecondMax(arr);
	}
}
