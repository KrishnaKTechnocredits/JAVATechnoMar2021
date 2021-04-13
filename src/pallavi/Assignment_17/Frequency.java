package pallavi.Assignment_17;

/*From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

public class Frequency {

	int getFrequency(int array[], int t) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == t)
				count++;
		}

		return count;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		int target = 23;
		int countF = new Frequency().getFrequency(arr, target);
		System.out.println("Frequency of " + target + " is " + countF);

	}

}
