/*
Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class ReturnMaxLength {
 
	String nameMaxLength(String[] name) {
		String maxLengthName = name[0];
		int maxLength = name[0].length();
		for(int index=0;index<name.length;index++) {
			if(maxLength <name[index].length()) {
					maxLength=name[index].length();
			        maxLengthName = name[index];
			}
		}
		System.out.println("Maximum Length Name is: "+maxLengthName);
		return maxLengthName;
	}
	public static void main(String[] arg) {
		String[] name = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new ReturnMaxLength().nameMaxLength(name);
		
	}
}
