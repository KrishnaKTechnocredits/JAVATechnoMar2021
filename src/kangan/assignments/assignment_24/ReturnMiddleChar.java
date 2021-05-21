package kangan.assignments.assignment_24;

/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.*/

public class ReturnMiddleChar {

	char[] getMiddleChar(String[] name) {
		int midCharIndex=0;
		 char[] output = new char[name.length];
		for(int index=0;index<name.length;index++) {
			
			String str = name[index];
			
			if(str.length()%2==0) {
				midCharIndex=str.length()/2-1;
				char ch= str.charAt(midCharIndex);
				output[index]=ch;
			}
			else {
				midCharIndex= str.length()/2;
				char ch= str.charAt(midCharIndex);
				output[index]=ch;
			}
		}
		return output;	
	}
	public static void main(String[] args) {
		ReturnMiddleChar returnMiddleChar = new ReturnMiddleChar();
		String[] arr= {"Techno", "Hello", "Credits"};
		 char[] ch  = returnMiddleChar.getMiddleChar(arr);
		 System.out.println(ch);
	}
}
