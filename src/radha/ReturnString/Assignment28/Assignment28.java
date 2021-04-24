/*
Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */
package radha.ReturnString.Assignment28;

public class Assignment28 {
	
	String getSortedString(String msg) {
		String digitString = "";
		String uCaseString = "";
		String lCaseString = "";
		for(int index=0; index<msg.length(); index++) {
			if(Character.isDigit(msg.charAt(index))) {
				digitString+=msg.charAt(index);
			}else if(Character.isUpperCase(msg.charAt(index))) {
				uCaseString += msg.charAt(index);
			}else if(Character.isLowerCase(msg.charAt(index))) {
				lCaseString += msg.charAt(index);
			}	
		}
		return digitString+uCaseString+lCaseString;
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		String msg = "Te1Ch2noCr4e_%$d8iTs9";
		String output = assignment28.getSortedString(msg);
		System.out.println("String with all numbers first followed by all Capital letter & Small letter\n"+output);
	}
}
