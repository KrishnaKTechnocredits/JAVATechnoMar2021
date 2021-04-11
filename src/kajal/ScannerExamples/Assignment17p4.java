//Frequency of target number

package kajal.ScannerExamples;

import java.util.Scanner;

public class Assignment17p4 {

	void FrequencyNum(int[] num,int target) {
		int cnt=0;
		for(int i=0; i<num.length; i++) {
			if(num[i] == target)
		
				cnt++;
		}		
		System.out.println("freq is: " + cnt);
		
	}
	
	public static void main(String [] args) {
		Assignment17p4 assign = new Assignment17p4();
		int[] num = {10,23,23,44,23,10,23,4,23};
		System.out.println("Enter target number");
		Scanner sc = new Scanner(System.in);
		int target= sc.nextInt();
		assign.FrequencyNum(num, target);
	}
}
