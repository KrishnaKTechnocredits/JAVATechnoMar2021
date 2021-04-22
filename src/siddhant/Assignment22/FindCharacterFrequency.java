package siddhant.Assignment22;

public class FindCharacterFrequency {

	void findSingleCharFreq(String str, char targetChar) {

		int targetCharCount=0;

		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)==targetChar)
				targetCharCount++;
		}
		System.out.println(targetChar+" -> "+targetCharCount+" times in "+str);
	}

	void findAllStringCharFreq(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch= str.charAt(index);
			if(index==str.indexOf(ch))
				findSingleCharFreq(str,str.charAt(index));
		}		
	}

	void findCharFreqOfAllStringArrayElements(String[] strArray) {
		for(int index=0; index<strArray.length; index++) {
			findAllStringCharFreq(strArray[index]);
		}	
	}

	public static void main(String[] args) {
		FindCharacterFrequency findCharacterFrequency= new FindCharacterFrequency();
		System.out.println("Output of Character frequency of e in TechnoCredits: ");
		findCharacterFrequency.findSingleCharFreq("technocredits",'e');
		System.out.println("======================================================================");

		System.out.println("Output of Find All Character frequency in TechnoCredits: ");
		findCharacterFrequency.findAllStringCharFreq("technocredits");
		System.out.println("======================================================================");

		System.out.println("Output of Find All Character frequency in an array of string: ");
		String[] strArray= {"Siddhant","Vedant", "John", "Swaraj", "Ziva"};
		findCharacterFrequency.findCharFreqOfAllStringArrayElements(strArray);
		System.out.println("=====================================================================");
	}
}
