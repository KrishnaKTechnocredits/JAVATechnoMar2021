package monika.Practise1.Revision;

import java.util.Arrays;

/*input: {1,2,0,3,0,1,3,4,9,0}
 * output: {0,0,0,1,2,1,3,4,9}
 */
public class Test9_Variations {

	int[] getArr(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				count++;
			}
		}
		for (int newIndex = 0; newIndex < arr.length; newIndex++) {
			if(arr[newIndex] != 0) {
				output[count] = arr[newIndex];
				count++;
			}
		}

		return output;
	}

	public static void main(String[] args) {
		Test9_Variations obj = new Test9_Variations();
		int[] arr = { 1, 2, 0, 3, 0, 1, 3, 4, 9, 0 };
		System.out.println(Arrays.toString(obj.getArr(arr)));

	}

}
