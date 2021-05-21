/*
 the index having maximum length
 */

package ami.Assignment_17;

public class MaxLengthIndexCount {
	
	int MaxLengthIndex(String[] input) {
		int max = input[0].length();
		int indexcount = 0;

		for (int index = 1; index < input.length; index++) {
			if (input[index].length() > max) {
				max = input[index].length();
				indexcount = index;
			}
		}
		return indexcount;
	}

	public static void main(String[] args) {
		String[] word = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		MaxLengthIndexCount maxLengthIndexCount = new MaxLengthIndexCount();
		int maxIndex = maxLengthIndexCount.MaxLengthIndex(word);
		System.out.println("The index having maximum length : ");
		System.out.println(maxIndex);
	}
}
