package surabhi.coding_exam15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFirstWord {
	static String getFirstRepeatingNonRepeatingWords(String str) {
		String[] arr=str.split(" ");
		String output="";
		boolean isRepeatedFirst=false, isNonRepeated=false;
		ArrayList<String> input=new ArrayList<String>(Arrays.asList(arr));
		for(int index=0;index<input.size();index++) {
			if(input.indexOf(input.get(index))!=input.lastIndexOf(input.get(index)) && !isNonRepeated) {
				if(!output.isEmpty())
					output=output+input.get(index)+" ";
				else
					output=output+" "+input.get(index);
				isNonRepeated=true;
			}else if(input.indexOf(input.get(index))==input.lastIndexOf(input.get(index)) &&(!isRepeatedFirst)) {
				if(!output.isEmpty())
					output=output+" "+input.get(index);
				else
					output=output+input.get(index)+" ";
				isRepeatedFirst=true;
			}
		}
		return output.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListFirstWord arrayListFirstWord=new ArrayListFirstWord();
		String str="Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output=getFirstRepeatingNonRepeatingWords(str);
		System.out.println(output);	
	}

}
