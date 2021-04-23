package renuka.Assignment18;

public class PrintCharacterFromAsciiValue97To122 {
	
	public void printCharacterFromValue97To122() {
		System.out.println("Characters from Ascii value of 97 to 122 is as follows : ");
		for (int num = 97; num <= 122; num++) {
			char ch = (char) num;
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		PrintCharacterFromAsciiValue97To122 printCharacterFromAsciiValue97To122 = new PrintCharacterFromAsciiValue97To122();
		printCharacterFromAsciiValue97To122.printCharacterFromValue97To122();
	}


}
