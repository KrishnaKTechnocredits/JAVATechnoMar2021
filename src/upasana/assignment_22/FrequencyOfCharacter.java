

/*Assignment - 22 :  16th April'2021
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


package upasana.assignment_22;
public class FrequencyOfCharacter {

	void frequency(String str, char targetCharacter) {
		int count=0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetCharacter)
				count++;
		}
		System.out.println("Frequency of " + targetCharacter + " in " + str + " is " + count);
	}

	void frequencyName(String str1) {
		for (int index = 0; index < str1.length(); index++) {
			char targetValue = str1.charAt(index);
			if (index == str1.indexOf(targetValue)) {
				frequency(str1, targetValue);
			}
		}
	}

	void frequencyArray(String[] arr) {
		for(int index=0; index<arr.length;index++) {
			frequencyName(arr[index]);
		}
	}

	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		frequencyOfCharacter.frequency("technocredits", 'e');
		System.out.println("");
		frequencyOfCharacter.frequencyName("aakanksha");
		System.out.println("");
		String[] arr = {"raj", "aarya", "aavruti", "shruti"};
		frequencyOfCharacter.frequencyArray(arr);

	}
}