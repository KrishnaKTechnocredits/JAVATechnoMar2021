/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
*/
package shashank_array;

public class ArrayFrequencyNum {

	public int arrayFrequencyNum(int[] arr, int targetNum) {
		int frequency = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == targetNum)
				frequency++;
		}
		return frequency;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 23, 23, 44, 23, 10, 23, 23, 23};
		ArrayFrequencyNum frequencyNum = new ArrayFrequencyNum();
		int targetNum=23;
		int frequency = frequencyNum.arrayFrequencyNum(arr,targetNum);
		System.out.println("Frequency of target number "+targetNum+" is "+frequency);
	}

}
