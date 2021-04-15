package prachi.Assignment_18;

//Program 4:  write a program which will print characters between ascii value 97 to 122.

public class Ascii_Four {

	char printCharValues(int asciiValue) {
		return (char)asciiValue;
	}

	public static void main(String[] args) {
		Ascii_Four asFour = new Ascii_Four();
		for(int  num = 97; num <= 122; num++) {
			char value = (char) asFour.printCharValues(num);
			System.out.println("Character of ascii : " +num+ " is '" +value +"'");
		}
	}
}
