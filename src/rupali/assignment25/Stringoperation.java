/*
 * Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25

 */
package rupali.assignment25;

public class Stringoperation {
	String[] stringwithdigit(String[] input) {
		int i=0,j,count=0;
		boolean flag=false;
		String[] ch= new String[input.length];
		for(i=0;i<input.length;i++) {

				for(j=0;j<input[i].length();j++) {
					if(Character.isDigit(input[i].charAt(j)) ) {
						flag=true;
						ch[count]=input[i];
						count++;
					}
					if(flag==true) {
						break;
					}
				}
				flag=false;
			}
		return ch;
	}
	public static void main(String[] args) {

		String[]  input= {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] str=new String[input.length];
		Stringoperation stringoperation = new Stringoperation();
		str=stringoperation.stringwithdigit(input);
		System.out.println("The string array to find maximum digit in it");
		for(int i=0;i<input.length;i++)
			System.out.println("String which contains  digits is: "+str[i]);
		
	}
}
