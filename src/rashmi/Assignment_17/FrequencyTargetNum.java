/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

package rashmi.Assignment_17;

import java.util.Scanner;

public class FrequencyTargetNum {

	int getFrequencyOfNum(int[] num, int targetNum) {
		int freqCnt = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == targetNum) {
				
				freqCnt++;
			}
		}
		System.out.println("Frequency of target number is " + freqCnt);
		return freqCnt;
	}

	public static void main(String[] args) {
		//int num[] = { 4, 8, 0, 9, 7, 8, 8, 8, 4, 4, 6 };
		FrequencyTargetNum frequencyTargetNum = new FrequencyTargetNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter ");
		int size= sc.nextInt();
		int arrNum[] =new int[size];
		for(int index = 0;index<arrNum.length;index++) {
			System.out.println("Enter the number "+(index+1));
			arrNum[index]=sc.nextInt();
		}
			
		System.out.println("Enter the target number ");
		int tNum = sc.nextInt();
		frequencyTargetNum.getFrequencyOfNum(arrNum, tNum);
		sc.close();
	}

}
