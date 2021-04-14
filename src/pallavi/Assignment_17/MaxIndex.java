package pallavi.Assignment_17;

/*return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/
public class MaxIndex {

	int findMaxLengthIndex(String[] name) {

		String max = name[0];
		int indexM = 0;
		for (int index = 1; index < name.length; index++) {
			if (max.length() < name[index].length()) {
				max = name[index];
				indexM = index;
			}
		}
		return indexM;
	}

	public static void main(String[] args) {
		String[] name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		int maxLengthIndex = new MaxIndex().findMaxLengthIndex(name);
		System.out.println(maxLengthIndex);
	}

}
