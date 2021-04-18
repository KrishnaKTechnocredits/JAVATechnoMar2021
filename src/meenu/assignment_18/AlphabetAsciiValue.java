package meenu.assignment_18;

/*Program 3:  write a method which will print ASCII value of A to Z.
*/

public class AlphabetAsciiValue {
	
	void getAsciiValueOfAlphabet() {
		for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) {
		     System.out.println(alphabet+" - "+(int)alphabet);
		}
	}

	public static void main(String[] args){
		System.out.println("ASCII value of alphabet A to Z are : ");
		AlphabetAsciiValue alphabetAsciiValue = new AlphabetAsciiValue();
        alphabetAsciiValue.getAsciiValueOfAlphabet();
		}
}
