/*Assignment - 22 :  16th April'2021

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
         And so on....	-------------------------------*/

package rashmi.Rashmi_Assignment_22;

public class ModularApproach {

	void oneCharacterFrequency(String str, char targetCh) {
		int freqCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == targetCh)
				freqCnt++;
		}
		System.out.println(targetCh + " -> " + freqCnt + " time in " + str);
	}

	void allCharFrequency(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				oneCharacterFrequency(str, ch);
		}
	}

	void allCharFrequencyArray(String[] str) {
		for (int index = 0; index < str.length; index++) {
			allCharFrequency(str[index]);
		}
	}

	public static void main(String[] args) {
		ModularApproach modularApproach = new ModularApproach();
		System.out.println("------One character frequency from given name----\n");
		modularApproach.oneCharacterFrequency("technocredits", 'e');
		System.out.println("\n-----All character frequency from given name----------\n");
		modularApproach.allCharFrequency("aakanksha");
		System.out.println("\n---all character frequency from each name given in String array-----\n");
		String[] str = { "raj", "aarya", "aavruti", "shruti" };
		modularApproach.allCharFrequencyArray(str);
	}
}
