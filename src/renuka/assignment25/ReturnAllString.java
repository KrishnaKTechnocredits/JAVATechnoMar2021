package renuka.assignment25;

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class ReturnAllString {
	
	String[] getStringFromArray(String[] str) {
		String[] str1 = new String[str.length];
		for(int index = 0; index < str.length; index++ ) {
			for(int index1 = 0; index1< str[index].length(); index1++) {
				char ch = str[index].charAt(index1);
				if(Character.isDigit(ch))
					str1[index] = str[index];
			}
			}
		return str1;
	}
	
		

	public static void main(String[] args) {
		ReturnAllString returnString = new ReturnAllString();
		String[] str = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] str2 = new String [str.length];
		str2 = returnString.getStringFromArray(str);
		System.out.println("String which contains number");
		for (int i = 0; i < str.length; i++) {
			if(str2[i] != null)
				System.out.println(str2[i]);
	}
  }
}
