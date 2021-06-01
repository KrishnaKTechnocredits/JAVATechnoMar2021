package madhavi_Khasbage.ClassVariableMethodRun;
/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapTwoString {

	void swapString(String str1, String str2) {
		System.out.println("input : input1 =" + str1 + ", input2 = " + str2);
		String temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("input : input1 =" + str1 + ", input2 = " + str2);
	}

	public static void main(String[] args) {
		SwapTwoString swapStr=new SwapTwoString();
		swapStr.swapString("JAVA","SELENIUM");
	}
}