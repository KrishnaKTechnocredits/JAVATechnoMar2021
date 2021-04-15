/*Program 1: Write a method which will return "Techno" if Uppercase character count is 
  higher then LowerCase character count, otherwise return "Credits". Print output in 
 main method.

input : TeCHnoSessionS
output : Credits
*/
package shilpa.Assignment_19;

public class CountUpperAndLowerCaseFromStr {
	String GetUpperLowerCharCount(String str) {
		int cntupper = 0;
		int cntlower = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				cntupper++;
			else
				cntlower++;
		}
		if (cntupper > cntlower) {
			System.out.println("Techno");
			return "Techno";
		} else {
			System.out.println("Credits");
			return "Credits";
		}
	}

	public static void main(String[] args) {
		CountUpperAndLowerCaseFromStr UpperAndLowerCaseFromStr = new CountUpperAndLowerCaseFromStr();
		UpperAndLowerCaseFromStr.GetUpperLowerCharCount("TechNoCRedIts");
	}
}
