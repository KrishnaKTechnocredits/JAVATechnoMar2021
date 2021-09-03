package amrutaM.codingTest;

import java.util.Arrays;

/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/
public class CodingTest3 {

	void removeElement(int[] input, int number) {
		System.out.println("Input array is --> " + Arrays.toString(input));
		int numberOcc = 0;
		for (int occurance = 0; occurance < input.length; occurance++) {
			if (input[occurance] == number)
				numberOcc++;
		}
		int[] output = new int[input.length - numberOcc];
		int count=0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != number) {
				output[count] = input[index];
				count++;
			}
			
		}
		System.out.println("Array after removing " + number + " resultant array is -->" + Arrays.toString(output));

	}

	public static void main(String[] args) {
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int element = 14;
		new CodingTest3().removeElement(input, element);
	}
}
