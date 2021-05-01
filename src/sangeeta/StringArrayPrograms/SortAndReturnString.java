/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/
package sangeeta.StringArrayPrograms;

public class SortAndReturnString {
	
	String getString(String str) {
		String digitStr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		for(int index = 0; index<str.length(); index++) {
				if(Character.isDigit(str.charAt(index)))
					digitStr = digitStr + str.charAt(index);
				else if(Character.isUpperCase(str.charAt(index)))
					upperCaseStr = upperCaseStr + str.charAt(index);
				else if(Character.isLowerCase(str.charAt(index)))
					lowerCaseStr = lowerCaseStr + str.charAt(index);
		}
		String output = digitStr + upperCaseStr + lowerCaseStr;
		return output;
		
	}
	
	String [] getStringArray(String [] arr) {
		String [] output = new String [arr.length];
		for(int index = 0; index<arr.length; index++) {
			output [index] = getString(arr[index]);
		}
		return output;
	}
	
	public static void main(String[] a) {
		SortAndReturnString sortAndReturnString = new SortAndReturnString();
		String [] arr = {"S9A9NG7eet3a", "7S8A45Rtik56", "7K7At7i9k7R"};
		String[] output = sortAndReturnString.getStringArray(arr);
		for(int index = 0; index<output.length; index++) {
			System.out.println(output[index]);
		}
		
	}

}
