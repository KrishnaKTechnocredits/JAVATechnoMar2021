package trupti.String.Assi25_26;
/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/
public class OneDigit {

	String getDigit (String str) {
		char c;
		for(int index = 0; index < str.length(); index ++) {
			c=str.charAt(index);
			if (Character.isDigit(c)) {
				return str;
			}
		}
		return "";
	}

	public static void main(String[] args) {
		OneDigit onedigit=new OneDigit();
		String [] arr={"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		System.out.println("String contained at least one chracter are as follows : ");
		for(int index=0;index<arr.length;index++) {
			String ans=onedigit.getDigit(arr[index]);
			if(!ans.equals(""))
				System.out.println(ans);
		}
	}
}
