package meenu.assignment_24;

/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
*/

public class StringMiddleChar {
	
	void getMiddleChar(String[] names) {
		for(int index = 0;index < names.length;index++) {
			char ch = '\0';
			if(names[index].length()% 2 == 0) { 
				 ch = names[index].charAt(names[index].length()/2-1);
			}else {
				ch = names[index].charAt(names[index].length()/2);
			}
			System.out.println("Middle character in "+names[index]+" is :"+ch);		
		}		
	}

	public static void main(String[] args) {
		String[] arr = {"Techno", "Hello", "Credits"};
		StringMiddleChar stringMiddleChar = new StringMiddleChar();
		stringMiddleChar.getMiddleChar(arr);
	}
}
