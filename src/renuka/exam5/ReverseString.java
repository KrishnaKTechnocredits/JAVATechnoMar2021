package renuka.exam5;

/*Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy*/

public class ReverseString {
	
	String getReverseString(String str) {
		String[] str1 = str.split(" ");
		String reverseWord = "";
		for(int index = 0; index < str1.length;index++){
        	StringBuffer sb = new StringBuffer(str1[index]);
        	//sb.reverse();
        	//String revString = sb.toString();
        	reverseWord += sb.reverse().toString() +" ";
  		}
		return reverseWord.trim(); 
	}

	public static void main(String[] args) {
		//ReverseString reverseString = new ReverseString();
		//String str = "hi hello how are you";
		System.out.print("Reverse String words is: "+new ReverseString().getReverseString("hi hello how are you"));
	}
}
