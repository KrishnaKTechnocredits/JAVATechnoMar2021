package krishna.Assignment_22;

public class CharacterFrequency {

	void oneCharFreq(String name, char character) {
		int frequency = 0;
		for (int index = 0; index < name.length(); index++) {
			if (character == name.charAt(index)) {
				frequency++;
			}
		}
		System.out.println(character + " is " + frequency + " times in " + name);
	}

	void allCharFreq(String name) {
		for (int index = 0; index < name.length(); index++) {
			char character = name.charAt(index);
			if (index == name.indexOf(character)) {
				oneCharFreq(name, name.charAt(index));
			}
		}
	}

	void allCharFreqFromString(String[] nameStr) {
		for (int index = 0; index < nameStr.length; index++) {
			allCharFreq(nameStr[index]);
		}
	}

	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		characterFrequency.oneCharFreq("technocredits", 'e');
		System.out.println("-----------------------------------");
		String name = "aakansha";
		characterFrequency.allCharFreq(name);
		System.out.println("-----------------------------------");
		String[] nameStr = { "raj", "aarya", "aavruti", "shruti" };
		characterFrequency.allCharFreqFromString(nameStr);
	}
}
