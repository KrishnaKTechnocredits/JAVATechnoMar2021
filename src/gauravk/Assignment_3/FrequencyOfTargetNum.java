package gauravk.Assignment_3;

import java.util.Scanner;

/*#3
 * Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */
public class FrequencyOfTargetNum {
	int targetCount;
	void findFrequency(int[] x, int a) {
		for(int index=0; index<x.length; index++) {
			if(a == x[index]) {
				targetCount = targetCount+1;
			}
		}
	}
	
	public static void main(String[] args) {
		FrequencyOfTargetNum frequencyOfTargetNum1 = new FrequencyOfTargetNum();
		System.out.println("How many numbers are you willing to analyse? ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] inp = new int[i];
		for(int index=0; index<i; index++) {
			System.out.println("type "+(index+1)+" number");
			inp[index] = sc.nextInt();
		}
		System.out.println("enter the target value: ");
		int target = sc.nextInt();
		frequencyOfTargetNum1.findFrequency(inp,target);
		System.out.println("Target number "+target+" appears "+frequencyOfTargetNum1.targetCount+" times");
	}
}