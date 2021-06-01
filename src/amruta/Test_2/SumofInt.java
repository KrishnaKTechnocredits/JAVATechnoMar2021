/*  Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */

package amruta.Test_2;

public class SumofInt {

	void getSumofInt(String str) {
		int sum = 0;
		String string = "";

		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit((str.charAt(index)))) {
				
				if (index < str.length() - 1  &&  Character.isDigit((str.charAt(index + 1)))) {
					string = string + str.charAt(index);
				}
				else {
					string = string + str.charAt(index);
					sum = sum + Integer.parseInt(string);		// Converting String to integer
					string = "";
				}
			}
		}
		System.out.println("Sum of all digits from String = " + sum);	
	}

	public static void main(String[] args) {
		String str = "12h14i4w8sdc15";
		SumofInt sum = new SumofInt();
		sum.getSumofInt(str);
	}
}
