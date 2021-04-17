/*
 Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */
package pavan.Assignment17;

public class FrequencyOfNumber {
	
	int target = 23;
	int fre = 0;
	void displayFreq(int[] args) {

		for (int index = 0; index < 9; index++) {

			if (args[index] == target) {
				fre = fre + 1;
			}
		}
		System.out.println(fre);
	}
	public static void main(String[] args) {
		int[] num = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		FrequencyOfNumber frequencyOfNumber = new FrequencyOfNumber();
		frequencyOfNumber.displayFreq(num);
	}
}
