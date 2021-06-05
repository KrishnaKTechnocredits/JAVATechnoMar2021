/*
 *  Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

 */
package rupali.assignment32;

public class SwapStringwithTemp {
	void getswapstrwithtemp(String str1,String str2) {
		String temp;
		temp=str2;
		str2=str1;
		str1=temp;
		System.out.println("After swapping Strings  Input1= "+str1+" "+" Input2= "+str2);
	}
	public static void main(String[] args) {
		String input1="Techno";
		String input2="Credits";
		System.out.println("Given Strings are Input1= "+input1+" "+" Input2= "+input2);
		new SwapStringwithTemp().getswapstrwithtemp(input1,input2);
	}

}
