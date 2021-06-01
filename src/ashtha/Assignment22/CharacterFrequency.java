package ashtha.Assignment22;

public class CharacterFrequency {

	void oneCharacterFrequency(String name, char target) {
		String name1 = name.toLowerCase();
		target = Character.toLowerCase(target);
		int count = 0;
		for (int index = 0; index < name1.length(); index++) {
			if (name1.charAt(index) == target)
				count++;
		}
		System.out.println("The frequency of " + target + " in "+name+ " : " + count);
	}

	void allCharacterFrequency(String name) {
		String name1 = name.toLowerCase();
		for (int index = 0; index < name1.length(); index++) {
			char ch = name1.charAt(index);
			if (index == name1.indexOf(ch))
				oneCharacterFrequency(name1, name1.charAt(index));
		}
	}

	void arrayCharacterFrequency(String[] input) {
		for (int index = 0; index < input.length; index++) {
			allCharacterFrequency(input[index]);
		}
	}

	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		System.out.println("Single Character Frequency");
		characterFrequency.oneCharacterFrequency("Astha", 'h');
		System.out.println("Frequency of all characters in a string");
		characterFrequency.allCharacterFrequency("Aakanksha");
		System.out.println("Frequency of all characters in an array of strings");
		String[] inputName = { "Astha", "Atrayee", "Ankita", "Akritee", "Swati" };
		characterFrequency.arrayCharacterFrequency(inputName);
	}
}
