/*
Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

Hint : you can use subString method.
 */
package radha.StringSwap.Assignment32;

public class Assignment32 {
	
	void StringSwapUsingTemp(String str1, String str2) {
		String temp = "";
		System.out.println("-----Swap two strings using temporary variable-----\n");
		System.out.println("Two strings before swapping are: string1="+str1+" & string2="+str2);
		temp=str1;
		str1=str2;
		str2 =temp;
		System.out.println("Two strings after swapping are: \nstring1 = "+str1+" & string2 = "+str2);
	}
	
	void StringSwapWithoutTemp(String str1, String str2) {
		System.out.println("\n-----Swap two strings without temporary variable-----\n");
		System.out.println("Two strings before swapping are: string1="+str1+" & string2="+str2);
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length()- str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Two strings after swapping are: \nstring1 = "+str1+" & string2 = "+str2);
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.StringSwapUsingTemp("Techno","Credits");
		assignment32.StringSwapWithoutTemp("Techno","Credits");
	}
}
