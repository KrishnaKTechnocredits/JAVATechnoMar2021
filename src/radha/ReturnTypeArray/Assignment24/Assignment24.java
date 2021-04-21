/*
 Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
 */

package radha.ReturnTypeArray.Assignment24;

public class Assignment24 {
	
	char[] getMiddleCharacter(String[] name) {
		char[] output = new char[3];
		for (int index = 0; index < name.length; index++) {
			if (name[index].length() % 2 == 0) {
				char middleChar = name[index].charAt(name[index].length() / 2 - 1);
				output[index]=middleChar;
			}
			else{
				char middleChar = name[index].charAt(name[index].length() / 2);
				output[index]=middleChar;
			}	
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		String arr[] = {"Techno", "Hello", "Credits"};
		System.out.println("Words are ["+arr[0]+" , "+arr[1]+" , "+arr[2]+"]");
		char[] names=assignment24.getMiddleCharacter(arr);
		System.out.print("Middle characters - ");
		for(int i=0;i < names.length;i++) {
			System.out.print(names[i]+" ");
		}
	}

}
