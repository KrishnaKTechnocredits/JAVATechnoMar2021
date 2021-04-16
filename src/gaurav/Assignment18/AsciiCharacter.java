package gaurav.Assignment18;

public class AsciiCharacter {
	
	void getAsciiOfChar(char ch) {
		
		int asciivalue=(int)ch;
	 
		System.out.println("ASCII Value of "+ch+ " is: " + asciivalue);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsciiCharacter asciiCharacter = new AsciiCharacter();
		asciiCharacter.getAsciiOfChar('a');
			
		
	}

}
