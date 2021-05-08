//WAP2 swap 2 String without using temporary variable.
// input ="Techno","Credits"
// output ="Credits","Techno"

package kapil.Assi32;

public class SwapStringWithoutTemp {

	void getSwapString(String string1, String string2) {

		string1 = string1 + string2;
		string2 = string1.substring(0, string1.length() - string2.length());
		string1 = string1.substring(string2.length());
		System.out.println("String 1 = " + string1);
		System.out.println("String 2 = " + string2);
	}

	public static void main(String[] args) {
		SwapStringWithoutTemp swapstring = new SwapStringWithoutTemp();
		swapstring.getSwapString("Techno", "Credits");
	}

}
