package ankit.coding_exam_4;

public class PrintPalendromFromString {
	boolean isPalendrom(String word) {
		String reverseWord = "";
		for(int index =word.length()-1 ; index >= 0; index--) {
			reverseWord = reverseWord + word.charAt(index);
		}
		if(reverseWord.equals(word)) {
			return true;
		}else 
			return false;	
	}

	public String AllWordList(String str) {
		String[] wordArray =  str.split(" ");
		String output = "" ;
		boolean flag = false;
		for(int index = 0 ; index < wordArray.length; index++) {
			flag = isPalendrom(wordArray[index]);	
			if(flag==true) {
				output = output + wordArray[index] + " ";
			}
		}
		return output.trim();	
	} 

	public static void main(String[] args) {
		String str = "Hi MAM hello NamaN techno";
		PrintPalendromFromString palendromFromString = new PrintPalendromFromString();
		System.out.println(palendromFromString.AllWordList(str));
	}
}

/*
 [Time: 21 Mins]
 * Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN
 */