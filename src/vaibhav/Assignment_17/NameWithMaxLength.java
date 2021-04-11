/*Java Assignment 17: 10th April 2021

Program 8: return the name having maximum length.

input : {"Maulik", "Krishna","Vaibhav", "Technocredits", "Harsh", "Techno" };
output : Technocredits

Note : Can be completed in two ways, using one variable and using two variables.
*/

package vaibhav.Assignment_17;

public class NameWithMaxLength {

	String maxName;
	int maxNameLength;

	void toGetMaxLengthName_TwoVariable(String[] arr) {
		maxNameLength = arr[0].length(); 
		maxName = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (arr[index].length() > maxNameLength) {
				maxNameLength = arr[index].length();
				maxName = arr[index];
			}
		}
		System.out.println("Name with maximum length form given set of numbers is : " + maxName);
	}

	void toGetMaxLengthName_OneVariable(String[] arr) {
		maxName = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (maxName.length() < arr[index].length()) {
				maxName = arr[index];
			}
		}
		System.out.println("Name with maximum length form given set of numbers is : " + maxName);
	}

	public static void main(String[] args) {

		String[] name = { "Maulik", "Krishna","Vaibhav", "Technocredits", "Harsh", "Techno" };

		NameWithMaxLength nameWithMaxLength = new NameWithMaxLength();
		System.out.println("============ Using Two Variables ============");
		nameWithMaxLength.toGetMaxLengthName_TwoVariable(name);
		System.out.println("");
		System.out.println("============ Using One Variable  ============");
		nameWithMaxLength.toGetMaxLengthName_OneVariable(name);
	}
}
