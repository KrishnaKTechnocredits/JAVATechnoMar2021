package shivani.Assignment_17;

/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/
public class MaxLengthArrayIndex {

	void maxLenthString(String[] words) {
		int maxlength = words[0].length();
		int maxl = 0;
		for (int index = 0; index < words.length; index++) {
			if (words[index].length() > maxlength) {
				maxlength = words[index].length();
				maxl = index;
			}
		}
		System.out.println("max name length :" + maxl);
	}

	public static void main(String[] args) {
		MaxLengthArrayIndex maxLengthArrayIndex = new MaxLengthArrayIndex();
		String[] names = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		maxLengthArrayIndex.maxLenthString(names);

	}
}
