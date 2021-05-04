package madhavi_Khasbage.ClassVariableMethodRun;

/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
Hint : you can use subString method.*/

public class SwapStringWithoutTemp {
	void swapString(String str1, String str2) {
		System.out.println("input : input1 =" + str1 + ", input2 = " + str2);
		
		str1= str2+str1 ;		
		str2=str1.substring(str2.length());		
		str1=str1.substring(0,str1.length()-str2.length());
				
		System.out.println("input : input1 =" + str1 + ", input2 = " + str2);
	}

	public static void main(String[] args) {
		SwapStringWithoutTemp swapStr=new SwapStringWithoutTemp();
		swapStr.swapString("Java","Selenium");
	}
}
