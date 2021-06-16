package kangan.Coding.Exam4;

/*String input = "Hi MAM hello NamaN techno";
output : MAM NamaN
*/
public class Palindrome {

	String[] getStringArray(String input) {
		String[] arr = input.split(" ");
		return arr;
	}
	String getPalindrome(String input) {
		String input1="";
		StringBuffer sb1 = new StringBuffer(input);
		StringBuffer output = sb1.reverse();
		if(output.toString().equals(input)){
			input1=output.toString();
		}
		return input1;
	}
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		String[] output = palindrome.getStringArray("Hi MAM hello NamaN techno");
		for(int index=0; index<output.length;index++) {
			String result = palindrome.getPalindrome(output[index]);
			System.out.println(result);
		}
	}
}
