package bhavana_assignment_17;

import java.util.Scanner;

public class FrequencyOfNumber {
/*From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4 */
	
	void frequencyOfTargetNumber(int targetNo) {
		int arr[]= {10,23,23,44,23,10,23,4,23};
		int frequncyOfnummber=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==targetNo)
				frequncyOfnummber++;
		}
		System.out.println("Frequency od targeted number is:"+frequncyOfnummber);
		
	
		
	}
	public static void main(String[] args) {
		FrequencyOfNumber fn=new FrequencyOfNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number who's frequency needs to find:");
		int targetNumber=sc.nextInt();
		fn.frequencyOfTargetNumber(targetNumber);
	}
}
