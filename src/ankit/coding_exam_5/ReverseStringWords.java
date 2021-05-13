/*
 Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
 */


package ankit.coding_exam_5;

public class ReverseStringWords {
	
	public String getReverseOfWord(String word) {
		StringBuffer sb = new StringBuffer(word);
		StringBuffer sb1 = sb.reverse();
		return sb1.toString();	
	}
	
	public void reverseString(String str) {
		String output = "";
		String[] strArr = str.split(" ");
		for(int index = 0 ; index < strArr.length ; index++) {
			String reverseWord = getReverseOfWord(strArr[index]);
			output = output + " " + reverseWord;
		}
		System.out.println(output);
	}
	

	public static void main(String[] args) {
		ReverseStringWords reverseStringWords = new ReverseStringWords();
		reverseStringWords.reverseString("hi hello how are you");
		
		//System.out.println(reverseStringWords.getReverseOfWord("Ankit"));

	}

}
