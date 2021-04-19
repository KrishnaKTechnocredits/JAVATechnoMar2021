package sai.Assignment17;

/*
 * Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4

 */
public class FrequencyArray {

	public static void main(String[] args) {

		int[] num = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		FrequencyArray frequencyArray = new FrequencyArray();
		frequencyArray.frequency(num);
	}

	void frequency(int[] num) {

		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 23) {
				count++;
			}
		}
		System.out.println("Frequency of 23 is " + count);

	}
}
