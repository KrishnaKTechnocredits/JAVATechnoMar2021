package mayur.assignment17;

public class MaximumLengthName {
	String maxLengthName(String[] names) {
		int length = names[0].length();
		String lengthName = names[0];
		for(int index=1; index<names.length; index++) {
			if (names[index].length()> length) {
				length = names[index].length();
				lengthName = names[index];
			}
		}
		return lengthName;
	}	

	public static void main(String[] args) {
		MaximumLengthName max = new MaximumLengthName();
		String[] names = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		max.maxLengthName(names);
		System.out.println("Name with max length is " +max.maxLengthName(names));
	}
}
