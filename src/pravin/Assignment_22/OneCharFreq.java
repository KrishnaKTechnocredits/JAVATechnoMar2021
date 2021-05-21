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
         And so on....	-------------------------------
 */

package pravin.Assignment_22;

public class OneCharFreq {

	void stringcharfreq(String input, char tChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == tChar)
				count++;
		}
		System.out.println("Frequency of target charater " + tChar + " in " + input + " is " + count);
	}

	void getAllCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				stringcharfreq(str, str.charAt(index));
		}

	}

	void arrayCharFreq(String[] names) {
		for (int index = 0; index < names.length; index++) {
			getAllCharFreq(names[index]);
		}

	}

	public static void main(String[] args) {
		OneCharFreq oneCharFreq = new OneCharFreq();
		System.out.println("===================Frequency of target character in String is============== ");
		oneCharFreq.stringcharfreq("Technocredits", 'e');

		System.out.println("=====Frequency of each caharcter in string===========================");
		oneCharFreq.getAllCharFreq("aakanksha");

		System.out.println("================Frequeny of single character in each input of array===============");
		String[] names = { "raj", "aarya", "aavruti", "shruti" };
		oneCharFreq.arrayCharFreq(names);

	}
}
