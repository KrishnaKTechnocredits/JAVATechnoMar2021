
/*
 Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */

package pavan.Assignment17;

public class MaxIndex {
	
	int maxLength(String[] args) {

		int lengthofnm = args[0].length();
		int indexmax = 0;

		for (int index = 1; index < 5; index++) {
			if (lengthofnm < args[index].length()) {
				lengthofnm = args[index].length();
				indexmax = index;
			}
		}
		
		return indexmax;

	}
	public static void main(String[] args) {
		String[] name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		MaxIndex test9 = new MaxIndex();
		int maxind=test9.maxLength(name);
		System.out.println("max index is " + maxind);
	}
}



