package prachi.Assignment_22;

/*Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits
b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....	-------------------------------*/



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
		String[] strArray= {"Prachi","raj", "aarya", "aavruti", "shruti"};
		findCharacterFrequency.findCharFreqOfAllStringArrayElements(strArray);
		System.out.println("=====================================================================");
	}
}


