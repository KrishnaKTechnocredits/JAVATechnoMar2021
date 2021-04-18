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
         And so on....	-------------------------------
*/
package sourabh.stringExamples2;

public class FindCharacterFrequency {
	void getOneCharacterFrequency(String str, char targetChar) {
		//System.out.println("Output : ");
		int targetCharCount=0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)==targetChar)
				targetCharCount++;
		}
		System.out.println(targetChar+" -> "+targetCharCount+" time in "+str);
	}
	void getAllCharacterFrequency(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch= str.charAt(index);
			if(index==str.indexOf(ch))
			getOneCharacterFrequency(str,str.charAt(index));
		}		
	}
	void getAllCharFrequencyFromStringArray(String[] strArr) {
		for(int index=0; index<strArr.length; index++) {
			getAllCharacterFrequency(strArr[index]);
		}	
	}
	public static void main(String[] args) {
		FindCharacterFrequency findCharacterFrequency= new FindCharacterFrequency();
		//findCharacterFrequency.getOneCharacterFrequency("technocredits",'e');
		//findCharacterFrequency.getAllCharacterFrequency("technocredits");
		String[] strArr= {"raj", "aarya", "aavruti", "shruti"};
		findCharacterFrequency.getAllCharFrequencyFromStringArray(strArr);
		
	}
}
