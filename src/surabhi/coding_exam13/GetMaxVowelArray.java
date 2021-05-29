package surabhi.coding_exam13;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}*/

import java.util.ArrayList;

public class GetMaxVowelArray {
	boolean isMaxVowelString(String str){
		str=str.toLowerCase();
		int count=0;
		char ch=' ';
		for(int index=0;index<str.length();index++){
			ch=str.charAt(index);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='0' ||ch=='u' ){
				count++;
			}
		}
		if(count>2){
			return true;
		}else{
			return false;
		}
	}
	
	public ArrayList<String> getMaxVowelsArray(String words[]){
		boolean isMaxVowel=false;
		ArrayList<String> output=new ArrayList<String>();
		for(String str:words){
			isMaxVowel=isMaxVowelString(str);
			if(isMaxVowel){
				output.add(str);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMaxVowelArray getMaxVowelArray=new GetMaxVowelArray();
		String arr[]= {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> output=getMaxVowelArray.getMaxVowelsArray(arr);
		System.out.println(output);

	}

}
