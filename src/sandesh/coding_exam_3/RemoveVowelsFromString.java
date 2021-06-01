/*WAP to return a string by removing all the vowels from the given String.
 Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr*/

package sandesh.coding_exam_3;

public class RemoveVowelsFromString {
	
	String getStringWithoutVowel(String eachSubString) {
		String tp = eachSubString;
		for(int index = 0; index < eachSubString.length(); index++)
			tp = tp.replaceAll("[AEIOUaeiou]", "");
		return tp;
	}
	
	String[] getEachString(String inpString) {
		String[] normalizedInputArray = inpString.split(" ");
		String[] eachSubString = new String[normalizedInputArray.length];
		for (int index = 0; index < normalizedInputArray.length; index++) {
			eachSubString[index] = getStringWithoutVowel(normalizedInputArray[index]);
		}
		return eachSubString;
		//return "HI";
	}

	public static void main(String[] args) {
		String input = "Globant 11 @@ ? India TEST automation EnGiNeEr  --";
		String[] normalizedInputArray = input.split(" ");
		String[] getFinalProcessedArray = new String[normalizedInputArray.length];
		getFinalProcessedArray = new RemoveVowelsFromString().getEachString(input);
		System.out.println("Input String is -: " + input);
		System.out.print("Output String is -: ");
		for (int index=0; index<getFinalProcessedArray.length; index++) {
			System.out.print(getFinalProcessedArray[index] + " ");
		}
	}
}
