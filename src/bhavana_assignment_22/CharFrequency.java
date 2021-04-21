package bhavana_assignment_22;
/*a) Find one character frequency from given name.
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
         And so on....	---------- */
public class CharFrequency {

	
	void singleCharFrequency(String input,char targetChar) {
		int frequency=0;
		for(int index=0;index<input.length();index++)
		{
			if(input.charAt(index)==targetChar)
				frequency++;
		}
		System.out.println("Frequency of "+targetChar+" in "+input+" is "+frequency);
	}
	
	
	void allCharFrequency(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(index==input.indexOf(ch))
			singleCharFrequency(input,ch);
		}
			
	}
	
	void allCharacterFrequencyFromArray(String[]arr) {
		for(int index=0;index<arr.length;index++) {
			allCharFrequency(arr[index]);
		}
	}
	public static void main(String[] args) {
		CharFrequency cf=new CharFrequency();
		String[] names={"raj", "aarya", "aavruti", "shruti"};
		//cf.singleCharFrequency("technocredits", 'e');
		//cf.allCharFrequency("aakansha");
		cf.allCharacterFrequencyFromArray(names);
	}
}
