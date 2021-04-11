package madhavi_Raut.Assignment_17;
/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class FindIndexofMaxLengthName {

	int findIndexofMaxLengthName(String[] names) {
		int maxIndex = 0;
		int maxLength = names[0].length();
		for (int index = 1; index < names.length; index++) {
			if (names[index].length() > maxLength) {
				maxLength = names[index].length();
				maxIndex = index;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		String[] names = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		System.out.println("Index having max length is "+new FindIndexofMaxLengthName().findIndexofMaxLengthName(names));
	}
}
