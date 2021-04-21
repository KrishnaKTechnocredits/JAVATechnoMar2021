/*Assignment - 24 : submit > 19th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.


 */
package ravindra_J.Assignment_No_24_MiddleChar;

public class Middle {

	char[] getMiddleChar(String[] str) {
		char ch1[] = new char[str.length];
		int middle = 0;String word = null ;
		int index =0;
		for(int i=0;i<str.length;i++) {
			word = str[i];	
			if(word.length()%2==0) 
				middle = word.length()/2-1;
			else 
				middle = word.length()/2;

			ch1[index] = word.charAt(middle);
			index++;
		}

		return ch1;
	}

	public static void main(String[] args) {
		String []arr = {"Technocredit", "Hello", "Credits"};
		Middle middle = new Middle();

		char ch []= middle.getMiddleChar(arr);
		for(int k=0;k<ch.length;k++)
			System.out.println(ch[k]);
	}

}
