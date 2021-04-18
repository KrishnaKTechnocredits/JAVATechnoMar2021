/*Assignment - 22 :  16th April'2021

b.Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1
 */
package ravindra_J.Assignment_No_22_EachCharCountFromString;

import java.util.Scanner;

public class EachCharCount {
	
	static void printCharFrequency(String str1, char target) {
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==target)
				count++;
		}	
		System.out.println(target+ " -> " +count);
	}

	static void getCountAllChar(String str1) {
		for(int index=0;index<str1.length();index++){
			char ch = str1.charAt(index);

			if(index==str1.indexOf(ch))
			{
				printCharFrequency(str1,str1.charAt(index));
			}
		}
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.next().toUpperCase();

		getCountAllChar(str);
		scanner.close();
	}

}
