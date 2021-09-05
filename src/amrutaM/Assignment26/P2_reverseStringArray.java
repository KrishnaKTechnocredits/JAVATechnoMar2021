package amrutaM.Assignment26;

import java.util.Arrays;

/*Program : 2  
reverse given string array. 
input : {"Credits", "Techno","From","Diwali","Happy"} 
output : {"Happy","Diwali","From","Techno","Credits"} */

public class P2_reverseStringArray {
	void getReverseArray(String[] input) {
		String[] output = new String[input.length];
		int count =0;
		for(int index=input.length-1;index>=0;index--) {
			output[count]=input[index];
			count++;
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		new P2_reverseStringArray().getReverseArray(input);
	}

}
