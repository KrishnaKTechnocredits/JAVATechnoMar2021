package priyanka_Kamble.assignment_22;

/*
 * Assignment - 22 :  16th April'2021
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
 */
public class FindFrequency {

	void frequency(String str1, char targetChar) {
		int count = 0;
		//char ch;
		for (int index = 0; index < str1.length(); index++) {
			if (String.valueOf(targetChar).equals(String.valueOf(str1.charAt(index))))
				count++;
		}
		System.out.println(" In " + str1 + " " + targetChar + " - aappears " + count + " times");
	}

	void allCharFrequency(String str2) {
		System.out.println("--------------------------------------------------");
		for (int index = 0; index < str2.length(); index++) {
			char targetChar = str2.charAt(index);
			if (str2.indexOf(targetChar) == index)
				frequency(str2, targetChar);
		}
	}

	void freqOfCharFromStringArray(String[] str3) {
		System.out.println("--------------------Input3------------------------------");
		for (int index = 0; index < str3.length; index++) {
			allCharFrequency(str3[index]);
		}
	}

	public static void main(String[] args) {
		String str1 = "technocredits";
		char targetChar = 'e';
		String str2 = "aakanksha";
		String[] str3 = { "raj", "aarya", "aavruti", "shruti" };
		new FindFrequency().frequency(str1, targetChar);
		new FindFrequency().allCharFrequency(str2);
		new FindFrequency().freqOfCharFromStringArray(str3);
	}
}
