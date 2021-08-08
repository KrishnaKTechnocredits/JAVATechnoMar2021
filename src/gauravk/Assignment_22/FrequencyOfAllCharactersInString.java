package gauravk.Assignment_22;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment - 22 : 16th April'2021
Create a class with following functionality. [Estimated time: 40 mins]
b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
 */
public class FrequencyOfAllCharactersInString {

	String s = "technocredits";
	int[] counter = new int[s.length()];
	int i, j;
	
	void frequencyFinder() {
			char [] ch = new char[s.length()];
			
			for(int i=0; i<s.length(); i++) {
				ch[i] = s.charAt(i);
			}
			
			for(i=0; i<s.length(); i++) {
				counter[i]=1;
				for(j=i+1; j<s.length(); j++) {
					if(ch[i]==ch[j]) {
					counter[i]++;
					ch[j]='0';
					}
				}
			}
			for(i=0; i<counter.length; i++) {
				if(ch[i]!='0')
					System.out.println(ch[i]+" repeated "+counter[i]+" times.");
			}
	}
	
	public static void main(String[] a) {
		new FrequencyOfAllCharactersInString().frequencyFinder();
	}

}