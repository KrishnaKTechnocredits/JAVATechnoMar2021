/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2

////
read >>
static to non static calling with object or without object
*/

package ravindra_J.Assignment_No_16_FrequecyOfCharInString;

import java.util.Scanner;

public class FrequencyOfCharacter {
		static int cnt;
		
		public static void countFrequecyOfCharFromString(String str, char ch){
			
			for(int index=0; index < str.length();index++){
				
				if(str.charAt(index)==ch){
					cnt++;
				}
			}
			System.out.println("Frequesncy of charcter "+ch+" in a given String "+str+ " : " +cnt);
			
		}
		
		public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String str1 = scanner.next();
			
			System.out.println("Enter the Character : ");
			char c1 = scanner.next().charAt(0);
			
			countFrequecyOfCharFromString(str1, c1);
		}
	 
 }
