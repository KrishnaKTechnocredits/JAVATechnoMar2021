/*From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class FrequencyOfTargetNumber {
	int TargetCount;
	
	int getfrequencyOfTargetNumber(int [] arr, int TargetNumber) {
		for(int index = 0;index<arr.length;index++) {
			if(arr[index] == TargetNumber)
			TargetCount++;
		}
		
		System.out.println("Frequency of given number in an arrey is  "+TargetCount);
		return TargetCount;	
}
	
	public static void main(String[] a) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter size of array");
	int size = scanner.nextInt();
	int[] arr = new int[size];
	for(int index =0; index<arr.length;index++) {
		System.out.println("Enter elements of  an Array: ");
		arr[index] = scanner.nextInt();
	}
	System.out.println("Enter Target number");
	int TargetNumber = scanner.nextInt();
	new FrequencyOfTargetNumber().getfrequencyOfTargetNumber(arr,TargetNumber);			

}



}
