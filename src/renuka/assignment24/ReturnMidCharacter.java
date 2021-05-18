package renuka.assignment24;

public class ReturnMidCharacter {
	
	char[] midChar(String[] arr) {
		char[] character = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				int index1 = arr[index].length() / 2 - 1;
				character[index] = arr[index].charAt(index1);
			} else if (arr[index].length() % 2 != 0) {
					int index1 = arr[index].length() / 2;
					character[index] = arr[index].charAt(index1);
			}
		}
		return character;
	}	
	public static void main(String[] args) {
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] character = new ReturnMidCharacter().midChar(arr);
		for (int index = 0; index < character.length; index++) {
			System.out.println(character[index]);
		}

	}
}
