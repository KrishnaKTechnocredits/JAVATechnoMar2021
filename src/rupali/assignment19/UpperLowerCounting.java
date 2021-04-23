/*
 * -------------------------------------------------------------------
Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */
package rupali.assignment19;


public class UpperLowerCounting {
	
	public static void main(String[] args) {
	
		System.out.println("Input : TeCHnoSessionS");
		String input="TeCHnoSessionS";
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if( Character.isUpperCase(ch))
				count++;
		}
		if(count>input.length())
			System.out.println("Techno");
		else
			System.out.println("Credits");
	}

}
