package amrutaM.arrayAssignments;

/*Array Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/
public class MaxNameIndex {

	int getMaxIndex(String[] names) {
		int maxIndex = 0;
		for (int index = 1; index < names.length; index++) {
			if (names[maxIndex].length() < names[index].length()) {
				maxIndex = index;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		MaxNameIndex maxNameLength = new MaxNameIndex();
		String[] input = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		int max = maxNameLength.getMaxIndex(input);
		System.out.println("Maximum length name is at index number --> " + max);
	}

}
