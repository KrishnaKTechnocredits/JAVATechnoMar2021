//return the name having maximum length.
//input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
//output : Technocredits
package prashant;

public class ArrMaxlengthStr {

	String dispMaxlen(String[] Name) {
		int maxlen = Name[0].length();
		String maxname = Name[0];

		for (int i = 0; i < Name.length; i = i + 1) {
			if (Name[i].length() > maxlen) {
				maxlen = Name[i].length();
				maxname = Name[i];
			}
		}
		return maxname;
	}

	public static void main(String[] args) {
		String[] Name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		String max = new ArrMaxlengthStr().dispMaxlen(Name);
		System.out.println(max);
	}
}
