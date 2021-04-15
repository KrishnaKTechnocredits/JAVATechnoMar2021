/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4
*/

package simmi.assignment_17_Array;

import java.util.Scanner;

public class FrequencyTarget {
	
	int frequency(int target) {
		int count =0;
		int[] arr = {10,23,23,44,23,10,23,4,23};
		for(int index = 0; index<arr.length;index++) {
			if(arr[index] == target) {
				count++;
			}
		}
		return count;
	}
		
	public static void main(String[] args) {
		FrequencyTarget frequencyTarget = new FrequencyTarget();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the target number");
		int target = scanner.nextInt();
		int countStore = frequencyTarget.frequency(target);
		System.out.println("Frequency of "+target+" is "+countStore+" times");
		scanner.close();
		}
}
