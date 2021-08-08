package gauravk.Assignment_24;
/*
 * After Lecture - 18_April_Session-27_Array_As_ReturnType Assignment - 24 : 18th April'2021
Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d
Note: for name having even length, consider length/2-1 index is middle character.
 */
public class ReturnMiddleCharactersOfStringArrays {
	
	public static void main(String[] a) {
		char [] middleCh = new ReturnMiddleCharactersOfStringArrays().middleCharacterExtraction(new String[] {"Techno","Hello","Credits"});
		System.out.println(middleCh);
	}
		
	char[] middleCharacterExtraction(String[] names) {
		char[] output = new char[names.length];
		for(int i=0; i<names.length; i++) {
			if(names[i].length()%2==0)
				output[i] = names[i].charAt(names[i].length()/2-1);
			else
				output[i] = names[i].charAt(names[i].length()/2);
		}
		return output;
	}
}