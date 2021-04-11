/*
 * Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits


 */
package rupali.assignment17;

import java.util.Scanner;

public class ArrayExample8 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the legnth of Array");
		int l=s1.nextInt();
		System.out.println("Enter the strings for array");
		String[] name= new String[l];
		for(int i=0;i<name.length;i++) 
			name[i]=s1.next();
		new ArrayExample8().freqoftarget(name);
		
	}
	
	void freqoftarget(String[] n) {
		String maxname=n[0];
		for (int index=0;index<n.length;index++) {
			if(maxname.length()<n[index].length())
				maxname=n[index];
		}
		System.out.println("String witn maximum length among given string is:-- "+maxname);
	}


}
