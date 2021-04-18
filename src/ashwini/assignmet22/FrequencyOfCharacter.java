package ashwini.assignmet22;
/*
 Assignment - 22 :  16th April'2021

Create a class with following functionality. [Estimated time: 40 mins]
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
public class FrequencyOfCharacter {
	char character;
	void checkFrequncyOfOneCharInString(String str, char ch) {
		character=ch;
		int count=0;
		for(int index = 0; index < (str.length()); index ++){
			if(str.charAt(index) == ch){			
				count++;
			}
		}
		System.out.print("charecter "+ ch+ " in "+str+" for " +count+ " times");
		System.out.println(count);
	}	
	
	void checkFrequncyOfAllCharInString(String str) {
		int count=0, flag=0;
		for(int index = 0; index < (str.length()); index ++) {
			count=0;
		    for(int j=0;j<(str.length());++j) {
		    if(str.charAt(j)==str.charAt(index))
		     count++;
		   }
		 
		   for(int k=0;k<index;++k) {
		    if(str.charAt(k)==str.charAt(index))
		     flag=1;
		     
		   }
		 
		   if(flag!=1) {
		    System.out.print(str.charAt(index)+":"+count+"\n");
		    flag=0;
		   }
		 }
		  
    }
	
	void checkFrequncyOfAllCharInStringInArray(String[] array) {
		for(int index=0;index<array.length;index++) {
			checkFrequncyOfAllCharInString(array[index]);
		}
	}
	
	
	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.checkFrequncyOfOneCharInString("technocredits", 'e');
		String string[] ={"raj", "aarya", "aavruti", "shruti"};
		frequencyOfCharacter.checkFrequncyOfAllCharInString("technocredits");
		frequencyOfCharacter.checkFrequncyOfAllCharInStringInArray(string);
	}

}
