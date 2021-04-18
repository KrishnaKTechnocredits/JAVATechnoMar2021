/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */

package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class FrequencyOfTargetNumber {
	static int size,target;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an Array");
		size = scanner.nextInt();

		int[] input = new int[size];
		System.out.println("Enter the "+size+" elements of an array");
		for(int index=0;index<size;index++) {
			input[index]= scanner.nextInt();
			}
		
		System.out.println("Enter the target");
		target = scanner.nextInt();
		
		FrequencyOfTargetNumber frequecyoftargetnumber = new FrequencyOfTargetNumber();

		int count = frequecyoftargetnumber.findFrequency(input, size, target);
		System.out.println("The frequency count of number "+target+" in array :"+count);
	}

	int findFrequency(int []input, int size, int target) {
		int cnt=0;
		
			for(int index1=0;index1<size;index1++) {
				
				if(input[index1]==target) {
					cnt++;
			}

			}
				
		return cnt;
	}
}
