package monika.Assignment24_Array;
/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.*/

public class GetMiddleCharValue {
	char[] returnMidCharOfString(String[] arr) {
		char[] charArr = new char[arr.length];
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length() % 2 == 0) 
				charArr[index] = arr[index].charAt(arr[index].length()/2-1);
			else
				charArr[index] = arr[index].charAt(arr[index].length()/2);
		}	
		return charArr;
	}

	public static void main(String[] args) {
		GetMiddleCharValue obj = new GetMiddleCharValue();
		String[] arr = {"Techno", "Hello", "Credits"};
		char[] charArr = obj.returnMidCharOfString(arr);
		System.out.println(charArr);

	}

}
