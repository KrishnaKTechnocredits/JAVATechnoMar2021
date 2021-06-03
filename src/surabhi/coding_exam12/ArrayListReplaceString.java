package surabhi.coding_exam12;

import java.util.ArrayList;

/*2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3*/

public class ArrayListReplaceString {
	int getReplacedStringArray(ArrayList<String> input, String name){
		int count=0;
		int index=0;
		String replaceStr="Technocredits";
		while(input.contains(name)){
			index=input.indexOf(name);
			input.set(index, replaceStr);
			//output.set(index,input.get(index));
			count++; 
		}
		System.out.println(input);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListReplaceString arrayListReplaceString=new ArrayListReplaceString();
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Vaibhav");//  ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
		arr.add("Aashay");
		arr.add("Prashant");
		arr.add("Aashay");
		arr.add("Aashay");
		arr.add("Anubhav");	
		int count=arrayListReplaceString.getReplacedStringArray(arr, "Aashay");
		System.out.println(count);
	}

}
