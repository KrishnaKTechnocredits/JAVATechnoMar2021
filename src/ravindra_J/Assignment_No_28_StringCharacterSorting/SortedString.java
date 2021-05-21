/*Assignment - 28 : 24th April'2021
Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */

package ravindra_J.Assignment_No_28_StringCharacterSorting;

public class SortedString {

	String digitLetter= "";
	String upperLetter = "";
	String lowerLetter = "";
	String sortedString = "";
	String specialLetter = "";

	String getSortedString(String str){

		for(int index = 0; index < str.length() ; index++){
			char ch = str.charAt(index);

			if(Character.isDigit(ch))
				digitLetter = digitLetter + ch;

			else if(Character.isUpperCase(ch))
				upperLetter = upperLetter + ch;

			else if(Character.isLowerCase(ch))
				lowerLetter = lowerLetter + ch;

			else 
				specialLetter = specialLetter + ch;
		}

		sortedString = digitLetter+upperLetter+lowerLetter+specialLetter;

		return sortedString;
	}

	public static void main(String[] args){
		SortedString sort = new SortedString();
		String str = "Te1Ch2noCr4e_%$d8iTs9";
		String output = sort.getSortedString(str);
		System.out.println("Sorted String Is --->" +output );

	}
}
