/*a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits
 */

package ravindra_J.Assignment_No_22_EachCharCountFromString;

import java.util.Scanner;

public class TargetCharCountInString {
	static int count = 0;
	static void getTargetCharCount(String str1,char ch1){
		for(int index=0;index<str1.length();index++) {
			if(str1.charAt(index)== ch1)
				count++;
		}
		System.out.println(ch1+" -> "+count);
	}

	public static void main(String[] args) {
		//String str = "technocredits";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.next();
		System.out.println("\nEnter target character from given string");
		char ch =scanner.next().charAt(0);

		getTargetCharCount(str,ch);
		scanner.close();
	}

}
