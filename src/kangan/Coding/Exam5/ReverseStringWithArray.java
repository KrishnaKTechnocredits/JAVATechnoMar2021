package kangan.Coding.Exam5;

/*Write a java program to reverse each word of a given string
input : hi hello how are you
output : ih olleh woh era uoy*/

public class ReverseStringWithArray {

	String getRevWordString(String input){
		StringBuffer sb1 = new StringBuffer(input);
		StringBuffer output = sb1.reverse();
		return output.toString();
		}
	String[] arrange(String input) {
		//String res = getRevWordString(output);
		String [] arr = input.split(" ");
		return arr;
	}
	public static void main(String[] args) {
		ReverseStringWithArray reverseString = new ReverseStringWithArray();
		String[] output = reverseString.arrange("hi hello how are you");
		//System.out.println(output);
		for(int index=0; index<output.length;index++) {
		String result = reverseString.getRevWordString(output[index]);
		System.out.println(result);
		}
		
	}
}
