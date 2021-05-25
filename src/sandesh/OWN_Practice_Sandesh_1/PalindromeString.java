//Check if given word is palindrome or Not "MALAYALAM"

package sandesh.OWN_Practice_Sandesh_1;

public class PalindromeString {
	
	boolean isStringPalindrome(String inputString) {
		boolean isPalindrome = true;
		for(int index = 0, reverseIndex = inputString.length()-1; index <= reverseIndex; index++, reverseIndex--){
			if(inputString.toLowerCase().charAt(index) != inputString.toLowerCase().charAt(reverseIndex)){
					isPalindrome = false;
					break;
			}
		}
		return isPalindrome;
	}
	
	public static void main(String[] args){
			String input = "Malayalam";
			boolean isPalindrome = new PalindromeString().isStringPalindrome(input);
			if(isPalindrome)
				System.out.println("Input string " + input + " is a Palindrome");
			else
				System.out.println("Input string " + input + " is NOT a Palindrome");
	}
}