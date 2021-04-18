//Assignment_18 : WAP to print ascii value of a character input

package ankit.assignment_18;

public class AsciiValueAToZ {

	void getAsciiValueAToZ(String alphabet) {
		int ascii = 0;
		char[] alpha = alphabet.toCharArray();
		for(int index = 0; index < alphabet.length();index++) {
			ascii = (int)alpha[index];
			System.out.println("For "+ alpha[index] +" ASCII value is "+ ascii);
		}

	}

	public static void main(String[] args) {
		AsciiValueAToZ asciiValueAToZ = new AsciiValueAToZ();
		asciiValueAToZ.getAsciiValueAToZ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
}		
