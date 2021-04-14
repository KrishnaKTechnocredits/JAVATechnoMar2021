//Assignment_18_ WAP to print character with ASCII value between 97 to 122

package ankit.assignment_18;

public class AsciiValuePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int index = 97 ; index<=122;index++) {
			char ch = (char)index;
			System.out.println("Ascii Valiue :"+ index +" Its Character is " + ch);	
		}	
	}
}
