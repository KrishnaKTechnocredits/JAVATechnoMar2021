package madhavi_Raut.Assignment_17;
/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4*/

public class FrequencyOfGivenNumber {
	
	void findFrequencyOfGivenNumber(int[]  num, int targetNumber) {
		int countOfTargetNumber = 0;
		for(int index=0; index<num.length; index++) {
			if(num[index] == targetNumber)
				countOfTargetNumber++;
		}
		System.out.println("Frequency of "+targetNumber+" in given array: "+countOfTargetNumber);
	}

	public static void main(String[] args) {
		int[] num = {10,23,23,44,23,10,23,4,23};
		int targetNumber = 23;
		new FrequencyOfGivenNumber().findFrequencyOfGivenNumber(num, targetNumber);
	}

}
