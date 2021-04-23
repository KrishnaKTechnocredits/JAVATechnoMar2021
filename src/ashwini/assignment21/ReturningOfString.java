package ashwini.assignment21;
/*
 Assignment 21:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.
(without using character class methods)
input : TeCHnoSessionS
output : Credits
 */

public class ReturningOfString {
	String  getCharCount(String str) {
		int upperCase = 0, lowerCase = 0;

		for(int index = 0; index < str.length(); index++)
		{
			char ch = str.charAt(index);
			if (ch >= 'A' && ch <= 'Z')
				upperCase++;
			else if (ch >= 'a' && ch <= 'z')
				lowerCase++;
		}
      
      if(upperCase>lowerCase)
        return "Techno";
      else
        return "Credits";
	}

	public static void main(String[] args) {
		ReturningOfString returningOfString = new ReturningOfString();
		String str = "TeCHnoSessionS";
	//	returningOfString.getCharCount(str);
		System.out.println(returningOfString.getCharCount(str));
		
	}

}
