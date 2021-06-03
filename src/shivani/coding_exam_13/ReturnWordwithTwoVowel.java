package shivani.coding_exam_13;

import java.util.ArrayList;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]*/

public class ReturnWordwithTwoVowel {
	
		
	ArrayList<String> getVowels(String[] names) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < names.length; i++) {
			int count = 0;
			boolean flag = false;
			for (int innerIndex = 0; innerIndex < names[i].length(); innerIndex++) {
				String ch = String.valueOf(names[i].charAt(innerIndex));
				if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i")
						|| ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")) {
					count++;
					if (count > 2) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				output.add(names[i]);
			}
		}
		return output;
	}
			
		
		
		
	
	
	public static void main(String[] args) {
		
		String input[]= {"Shivani","Sakshi","deepa","Anjali","Saloni"};
		ReturnWordwithTwoVowel returnWordwithTwoVowel = new ReturnWordwithTwoVowel();
		ArrayList<String> output = new ArrayList<String>();
		output=returnWordwithTwoVowel.getVowels(input);
		System.out.println("output"+output);
		
	}

}
