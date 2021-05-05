/*program 2: swap 2 String without using temporary variable.
	input : input1 = "Techno" , input2 = "Credits";
	output : input1 = "Credits", input2 = "Techno"
	Hint : you can use subString method.*/
package ravindra_J.Assignment_No_32_String_Swapping;

public class SwapStringWithoutTemp {
	
	void getSwapStringWithoutTemp(){
			String str1="Techno",str2="Credit";
			
			str1=str1+str2;
			str2=str1.substring(0,(str1.length()-str2.length()));
			str1=str1.substring(str2.length());
			
			System.out.println("String after swapping -> \nstr1="+str1+" , str2="+str2);
		}
		public static void main(String []args){
			SwapStringWithoutTemp snut = new SwapStringWithoutTemp();
			snut.getSwapStringWithoutTemp();
		}
}
