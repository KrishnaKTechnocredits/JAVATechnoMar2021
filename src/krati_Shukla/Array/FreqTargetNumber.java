//Program 4: From given numbers, return the frequency of target number.

package krati_Shukla.Array;

public class FreqTargetNumber {
	
	void frequency(int[] num, int target) {
		int targetCount=0;
		for(int index=0; index<num.length; index++) {
			if (num[index] == target)
				targetCount = targetCount+1;
		}
		System.out.println("Occurence of Target Number is :"+targetCount);
	}
	
	public static void main(String[] a) {
		FreqTargetNumber freqTargetNumber = new FreqTargetNumber();
		int[] num = {10,23,23,44,23,10,23,4,23};
		int target = 23;
		freqTargetNumber.frequency(num, target);
	}

}
