/*

Input = {"Hello", "Hi", "Techno"};
Output = Hello_Hi_Techno

*/


package vaibhav.Practive;

public class StringOutput {

	String getString(String[] str) {
		String outputArr="";
		for (int index =0;index<str.length;index++) {
			if (index == 0)
				outputArr = str[index];
			else
				outputArr += "_" + str[index];
		}
		return outputArr;
	}
	
	String getStringWithSubstring(String[] str) {
		String outputArr="";
		for (int index =0;index<str.length;index++) {
			outputArr += "_" + str[index];
		}
		
		//*****************************************************************************//
		//   String class new method use --> substring (int beginIndex, int endIndex)  //
		//*****************************************************************************//
		return outputArr.substring(1);
	}
	
	public static void main(String[] args) {
		
		String[] str = {"Hello", "Hi", "Techno"};
		StringOutput stringOutput = new StringOutput();
		
		//stringOutput.getString(str);
		String output1 = stringOutput.getString(str);
		String output2 = stringOutput.getStringWithSubstring(str);
		System.out.println(output1);
		System.out.println(output2);
		
	
		
		
	}
}
