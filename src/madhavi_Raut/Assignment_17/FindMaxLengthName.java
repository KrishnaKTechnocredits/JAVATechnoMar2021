package madhavi_Raut.Assignment_17;
/*
Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class FindMaxLengthName {
	
	String findMaxLengthName(String[] names) {
		int maxLength = names[0].length();
		String maxLegthName = names[0];
		for(int index=1; index<names.length; index++) {
			if (names[index].length()> maxLength) {
				maxLength = names[index].length();
				maxLegthName = names[index];
			}
		}
		return maxLegthName;
	}	
	
	public static void main(String[] args) {
		String[] names = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new FindMaxLengthName().findMaxLengthName(names);
		System.out.println("Name with max length is "+(new FindMaxLengthName().findMaxLengthName(names)));
	}
}
