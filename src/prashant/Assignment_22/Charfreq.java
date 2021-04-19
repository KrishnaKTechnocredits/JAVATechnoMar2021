/*Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits*/

package prashant.Assignment_22;

public class Charfreq {

	void freq(String str, char target) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				cnt++;
			}
		}
		System.out.println("Frequency of " + target + " in " + str + " is " + cnt);
	}

	public static void main(String[] args) {
		Charfreq ch = new Charfreq();
		String str = "TechnoCredits";
		ch.freq(str, 'e');
	}
}