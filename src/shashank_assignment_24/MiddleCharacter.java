package shashank_assignment_24;

public class MiddleCharacter {

	char[] middleChracter(String arr[]) {
		char ch = ' ';
		char array[] = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (str.length() % 2 == 0 && str.length() != 0) {
				ch = str.charAt((str.length() / 2) - 1);
				array[index] = ch;
			} else if (str.length() % 2 != 0 && str.length() != 0) {
				ch = str.charAt(str.length() / 2);
				array[index] = ch;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleCharacter middleCharacter = new MiddleCharacter();
		String arr[] = { "Techno", "Hello", "Credits" };
		char ch[] = middleCharacter.middleChracter(arr);
		for (int index = 0; index < ch.length; index++) {
			System.out.println("Middle character of string " + arr[index] + " is " + ch[index]);
		}
	}

}
