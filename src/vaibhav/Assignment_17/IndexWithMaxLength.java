/*Java Assignment 17: 10th April 2021

Program 9: return the index having maximum length from given string array.

input : { "Maulik", "Krishna","Vaibhav", "Technocredits", "Harsh", "Techno"  };
output : 2

*/

package vaibhav.Assignment_17;

public class IndexWithMaxLength {
	int maxIndex;

	void toGetMaxLengthIndex(String[] arr) {
		maxIndex = 0;

		for (int index = 1; index < arr.length; index++) {
			if (arr[maxIndex].length() < arr[index].length()) {
				maxIndex = index;
			}
		}
		
		System.out.println("Index with maximum length form given set of numbers is : " + maxIndex);
		
	}

	public static void main(String[] args) {

		String[] name = { "Maulik", "Krishna", "Vaibhav", "Technocredits", "Harsh", "Techno" };

		IndexWithMaxLength indexWithMaxLength = new IndexWithMaxLength();

		System.out.println("============ Using One Variable  ============");
		indexWithMaxLength.toGetMaxLengthIndex(name);
	}
}
