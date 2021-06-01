/* 10th April 21 --- Assignment 17 ---- Program No 8 :
 * Program 8: return the name having maximum length.
 
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits

*/

package amruta.Array_Assignment_17;

public class FindMaxLengthofString {

	void printMaxStringLength(String[] str) {
		
	// -------- Printing length and Name of maximum String ----------//
		
		int maxlength = str[0].length();
		String maxname = str[0];
		 
		for(int index = 1; index < str.length ; index++) {
			if (str[index].length() > maxlength) {
				
				maxlength = str[index].length();  // called length on index -- will print index[string] length
				maxname = str[index];			  // called index -- will print string
			}
		}
		System.out.println("Maximum Length of String is : " + maxlength);
		System.out.println("String Name with Maximum Length : " + maxname);
	}
	
	// -------- Directly printing Name having Maximum Length ----------//
	
	void printMaxlengthName(String[] str) {
			
			String maxname = str[0];
			 
			for(int index = 1; index < str.length ; index++) {
				if (str[index].length() > maxname.length()) {
					
					maxname = str[index];			  // called index -- will print string
				}
			}
			System.out.println("String Name with Maximum Length : " + maxname);
		}
	
	
	public static void main(String[] args) {
		String[] name = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		
		new FindMaxLengthofString().printMaxStringLength(name);
		
		System.out.println("----------------------------------------------");
		
		new FindMaxLengthofString().printMaxlengthName(name);
	}
}
