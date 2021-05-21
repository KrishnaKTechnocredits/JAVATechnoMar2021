/* Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1*/
package prashant.Assignment_22;

public class Allcharfreq {
	void freqcal(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == i)
				display(str, str.charAt(i));
		}

	}

	void display(String s, char t) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t)
				cnt++;
		}
		System.out.println("Frequecy of letter " + t + " in word " + s + " is " + cnt);
	}

	public static void main(String[] args) {
		Allcharfreq chr = new Allcharfreq();
		String str = "aakanksha";
		chr.freqcal(str);
	}
}