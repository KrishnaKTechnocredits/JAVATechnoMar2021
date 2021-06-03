package priyanka_Panat.assignment24;
/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.*/

public class FindMiddleCharOfString {

	void findMiddleChar(String[] array) {
		//char ch = ' ';
		int minIndex =0 ;
		for (int index = 0; index < array.length; index++) {
			String innerArrayString = array[index];

			if(innerArrayString.length()%2 == 0)
				minIndex = innerArrayString.length()/2 - 1 ;
			else
				minIndex = innerArrayString.length()/2 ;
			
			char ch = innerArrayString.charAt(minIndex);
			System.out.println(" Minddle Character of " +innerArrayString + " is - '" +ch+ "'");
		}
	}

	public static void main(String[] args) {
		// new FindMiddleCharOfString()
		String[] array = { "Techno", "Hello", "Credits" };
		new FindMiddleCharOfString().findMiddleChar(array);
	}
}
