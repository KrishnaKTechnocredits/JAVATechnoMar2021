package ashish_Vyas.Assignment_25;

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class ReturnStringWithOneNumber {
	
	String getNameWithNumber(String name) {
		String nameWithDigit = "";
		for(int index=0; index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				nameWithDigit = name;
			}
		}
		return nameWithDigit;
	}
	public static void main(String[] args) {
		ReturnStringWithOneNumber returnStringWithOneNumber = new ReturnStringWithOneNumber();
		String [] names = {"TechnoCredits", "HP1w","Kangan", "Pd3R4K9", "Krishna", "Aashvi25"};
		   for(int index=0; index<names.length;index++) {
		String output = returnStringWithOneNumber.getNameWithNumber(names[index]);
		System.out.println(output);
	}
	}
}
