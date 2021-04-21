package madhavi_Raut.Assignment_24;

/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.*/
public class FindMidChar {
	char[] findMidChar(String[] names) {
		char[] midCharArray = new char[names.length];
		for (int index = 0; index < names.length; index++) {
			int strLength = names[index].length();
			for (int innerIndex = 0; innerIndex < strLength; innerIndex++) {
				if (strLength % 2 == 0)
					midCharArray[index] = names[index].charAt(((strLength / 2) - 1));
				else
					midCharArray[index] = names[index].charAt((strLength / 2));
			}
		}
		return midCharArray;
	}

	public static void main(String[] args) {
		FindMidChar findMidChar = new FindMidChar();
		String[] names = { "Techno", "Hello", "Credits" };
		char[] midcharArray = findMidChar.findMidChar(names);
		System.out.println("Mid char of names in provided array is: ");
		for (int index = 0; index < midcharArray.length; index++) {
			System.out.println(midcharArray[index]);
		}
	}

}
