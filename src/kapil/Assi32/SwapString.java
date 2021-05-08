//WAP swap 2 String using temporary variable.
// input ="Techno","Credits"
// output ="Credits","Techno"
package kapil.Assi32;

public class SwapString {
	void getSwapStr(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("String 1 = " + str1);
		System.out.println("String 2 = " + str2);
	}

	public static void main(String[] args) {
		SwapString swapstr = new SwapString();
		swapstr.getSwapStr("Techno", "Credits");
	}

}
