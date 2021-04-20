/* 
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/
package ravindra_J.Assignment_No_25_Prime_and_Array_Op;

public class StringDigit {
	int count=0;
	String[] getStringWithDigit(String in[]) {
		String arr[] = new String[in.length];
		for(int i=0;i<in.length;i++) {
			 
			String str=in[i];
			int j;
			for(j=0;j<str.length();j++) {
				if(Character.isDigit(str.charAt(j))) {
					count++;
					arr[i]=str;
					break;
				}
			}
		}
			
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		StringDigit stringDigit= new StringDigit();
		String input[]= {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String ans[]=stringDigit.getStringWithDigit(input);
		for(int i=0;i<ans.length;i++) {
			if(ans[i]!=null)
			System.out.println(ans[i]);
		}
	}
	

}
