/*
 *Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
 */

package pavan.Assignment17;

public class MaxLengthArray {
	
	String  maxLength(String[] args) {
		int lengthofnm = args[0].length();
		String maxstring= null;
		
		for (int index = 1; index < 5; index++) {
			if (lengthofnm < args[index].length()) {
				lengthofnm = args[index].length();
				 maxstring= args[index];
			}
		}
		
		return maxstring;
	}
	public static void main(String[] args) {
		String[] name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		MaxLengthArray test8 = new MaxLengthArray();
		String maxstr =test8.maxLength(name);
		System.out.println("max Length String is: "+ maxstr);
		
	}

}
