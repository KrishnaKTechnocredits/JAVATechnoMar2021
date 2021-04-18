/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

package rashmi.Assignment_17;

public class MaximumLengthName {

	String getMaxName(String[] name) {
		String maxName = name[0];
		for (int index = 1; index < name.length; index++) {
			if (maxName.length()<name[index].length()) {
				maxName=name[index];
				
			}
		}
		System.out.println("Name having maximum length is " + maxName);
		return maxName;

	}

	public static void main(String[] args) {

		String name[] = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" ,"Peaceful life happy life"};
		MaximumLengthName maximumLengthName = new MaximumLengthName();
		maximumLengthName.getMaxName(name);
	}
}
