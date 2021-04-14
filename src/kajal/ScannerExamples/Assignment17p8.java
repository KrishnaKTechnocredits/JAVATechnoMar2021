//Maximum length or character ka index
package kajal.ScannerExamples;

public class Assignment17p8 {

	int maxLengthIndex(String[] names) {
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
		Assignment17p8 max = new Assignment17p8();
		String[] names = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		System.out.println("Index having max length is "+max.maxLengthIndex(names));
	}

}

