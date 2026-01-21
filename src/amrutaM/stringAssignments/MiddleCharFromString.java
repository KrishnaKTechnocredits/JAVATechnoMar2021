package amrutaM.stringAssignments;

/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.
Used length/2-2
*/
public class MiddleCharFromString {

	static char[] getMiddleCharFromEachString(String[] input) {
		char [] output = new char[input.length];
		for(int index=0; index<input.length;index++) {
			int strLength = input[index].length();
			if(strLength%2 ==0) {
				output[index]= (input[index].charAt(strLength/2-1));
			}else
				output[index]= input[index].charAt(strLength/2);
			}
		return output;
		
	}

	public static void main(String[] args) {
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] output = getMiddleCharFromEachString(arr);
		for(char c :output) {
			System.out.print(c +"\t");
		}
	}
}
