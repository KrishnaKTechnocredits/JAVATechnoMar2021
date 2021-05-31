/*
 * Assignment - 32 : 4th May'2021

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"


Hint : you can use subString method.
 */
package rupali.assignment32;

public class SwapStringwithoutTemp {
	void getswapstrwithouttemp(String str1,String str2) {
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After swapping Strings  Input1= "+str1+" "+" Input2= "+str2);
	}
	public static void main(String[] args) {
		String input1="Techno";
		String input2="Credits";
		System.out.println("Given Strings are Input1= "+input1+" "+" Input2= "+input2);
		new SwapStringwithoutTemp().getswapstrwithouttemp(input1,input2);
	}
}
