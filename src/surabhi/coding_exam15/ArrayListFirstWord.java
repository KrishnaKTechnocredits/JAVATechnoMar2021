package surabhi.coding_exam15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFirstWord {
	static String getFirstRepeatingNonRepeatingWords(String str) {
		String[] arr=str.split(" ");
		String output="";
		String temp1="", temp2="";
		boolean isRepeatedFirst=false, isNonRepeated=false;
		ArrayList<String> input=new ArrayList<String>(Arrays.asList(arr));
		
		for(int index=0;index<input.size();index++) {
			if(input.indexOf(input.get(index))!=input.lastIndexOf(input.get(index)) && !isNonRepeated) {
				temp1=input.get(index);
				isNonRepeated=true;
			}else if(input.indexOf(input.get(index))==input.lastIndexOf(input.get(index)) &&(!isRepeatedFirst)) {
				temp2=input.get(index);
				isRepeatedFirst=true;
			}
		}
		output=temp1+" "+temp2;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListFirstWord arrayListFirstWord=new ArrayListFirstWord();
		String str="Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output=getFirstRepeatingNonRepeatingWords(str);
		System.out.println(output);	
	}

}
