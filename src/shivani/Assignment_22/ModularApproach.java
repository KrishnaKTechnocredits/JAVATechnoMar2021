package shivani.Assignment_22;

/*Find one character frequency from given name.
Input: name - technocredits
          character - e
Output : e -> 2 time in technocredits*/
public class ModularApproach {

	void frequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}

		}
		System.out.println(ch + " -> " + count + " time in " + str);
	}

	public static void main(String[] args) {

		ModularApproach modularApproach = new ModularApproach();
		modularApproach.frequency("shivani", 'i');
	}

}
