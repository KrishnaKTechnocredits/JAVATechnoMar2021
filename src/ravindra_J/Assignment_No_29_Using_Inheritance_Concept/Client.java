package ravindra_J.Assignment_No_29_Using_Inheritance_Concept;

public class Client extends Digit{
	
	public static void main(String[] args) {
		String input = "89au9H23i4pY6";
		Client client = new Client();
		client.getSortedString(input);			
	}

	void getSortedString(String str) {
		getDigit(str);
		String concatedLetter = getLetter(str);
		System.out.println("Output String =>>" +odd+concatedLetter+even);
	}

	
}

	
