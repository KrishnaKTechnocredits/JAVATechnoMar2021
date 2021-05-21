package monika.Assignment32_SwapStringValues;
/*Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
Hint : you can use subString method.*/
public class SwapStringValues {
		void swapStringFunctions() {
			String s1 = "Techno", s2 = "Credits", temp = "";
			temp = s1;
			s1=s2;
			s2= temp;
			
			System.out.println("After Swapping");
			System.out.println("Values of s1: "+ s1+" and values of s2: "+s2);
		}
		
		void swapWithoutUsingTemp() {
			String s1 = "Techno", s2 = "Credits";
			s1 = s1+s2;
			System.out.println("Without using temp variable for Swapping");
			System.out.println("Value of s1: "+s1.substring(6));
			s2 = s1;
			System.out.println("Value of s2: "+s2.substring(0,6));
		}
		
		public static void main(String[] args) {
			SwapStringValues obj = new SwapStringValues();
			obj.swapStringFunctions();
			obj.swapWithoutUsingTemp();
		}
}
