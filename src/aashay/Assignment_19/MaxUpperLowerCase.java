package aashay.Assignment_19;
/*
 * Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */

public class MaxUpperLowerCase {
	
	String caseCount(String text) {
		int upperCaseCount = 0, lowerCaseCount=0;
		
		for(int i=0; i <=text.length()-1;i++ ) {
			if(Character.isUpperCase(text.charAt(i))) {
				upperCaseCount++;
			}else
				lowerCaseCount++;
		}
		if(upperCaseCount > lowerCaseCount) {
			return "Techno";
		}else
			return "Credits";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxUpperLowerCase maxUpperLowerCase = new MaxUpperLowerCase();
		System.out.println("Input = TeCHnoSessionS \n"+maxUpperLowerCase.caseCount("TeCHnoSessionS"));
		
		

	}

}
