package pallavi.Assignment_17;

/*return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class MaxLengthName {

	String findMaxLengthName(String[] name) {

		String max = name[0];
		for (int index = 1; index < name.length; index++) {
			if (max.length() < name[index].length())
				max = name[index];
		}
		return max;
	}

	public static void main(String[] args) {
		String[] name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		String maxLengthNam = new MaxLengthName().findMaxLengthName(name);
		System.out.println(maxLengthNam);
	}

}
