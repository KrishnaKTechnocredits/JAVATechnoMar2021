/*Find all character frequency from each name given in String array.
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
package prashant.Assignment_22;

public class AllcharfreqStrArr {
	// Method calculate frequency 
	void freqcal(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == i)
				display(str, str.charAt(i));
		}
	}

	// Method to check count of alphabet in word
	void display(String s, char t) {
		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t)
				cnt++;
		}
		System.out.println("Frequecy of letter " + t + " in above word is " + cnt);
	}

	public static void main(String[] args) {
		AllcharfreqStrArr chr = new AllcharfreqStrArr();
		String str[] = { "raj", "aarya", "aavruti", "shruti" };
		for (int i = 0; i < str.length; i++) {
			System.out.println("Word :  " + str[i]);
			chr.freqcal(str[i]);
		}
	}
}
