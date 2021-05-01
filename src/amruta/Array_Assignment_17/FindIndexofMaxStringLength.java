/* 10th April 21 --- Assignment 17 ---- Program No 9 :

return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2

 */
package amruta.Array_Assignment_17;

public class FindIndexofMaxStringLength {

	int findIndexofMaxLengthName(String[] names) {
		int maxIndex = 0;
		int maxLength = names[0].length();
		
		for (int index = 1; index < names.length; index++) {
			
			if (names[index].length() > maxLength) {
				
				maxLength = names[index].length();  // called index -- will print string
				maxIndex = index;					// print only index id
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		String[] names = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		int maxindexnum = new FindIndexofMaxStringLength().findIndexofMaxLengthName(names);
		
		System.out.println("Index having Maximum Length string is : " + maxindexnum);
	}
}
