/*
  Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits 
 */

package pavan.Assignment_22;

import pavan.Assignment16.FindTheFreq;

import java.util.Scanner;

public class FindFreq {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:= ");
		String str = scan.nextLine();
		System.out.println("Enter the alpah for which frequency is to be identified:= ");
		char ch = scan.next().charAt(0);
		FindTheFreq findTheFreq = new FindTheFreq();
		findTheFreq.charFreq(str, ch);

	}

}
