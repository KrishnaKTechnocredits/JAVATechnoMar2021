package amrutaM.CodingTest6;

/*Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
Time taken = 9 mins*/
public class P2_NonRepeatingWord {

	void getFirstNonRepeatingWord(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			if (input.indexOf(word) == input.lastIndexOf(word)) {
				System.out.println("First non repeating word in the given string is "+word);
				break;
			
			}
		}
	}

	public static void main(String[] args) {
		String input = "hi this is techno gm credits this hi is";
		new P2_NonRepeatingWord().getFirstNonRepeatingWord(input);

	}
}
