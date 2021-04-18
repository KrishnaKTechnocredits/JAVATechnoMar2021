package sandesh.Assignment_17;

public class MaxLengthNameFromArray {

	String getMaxLengthString(String[] inArray) {
		String maxLengthString = inArray[0];
		for(int index=1; index<inArray.length; index++) {
			if(maxLengthString.length() < inArray[index].length())
				maxLengthString = inArray[index];
		}
		return maxLengthString;
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		String maximumLengthString = new MaxLengthNameFromArray().getMaxLengthString(inputArray);
		System.out.println("Maximum length string from given array is -: " + maximumLengthString);
	}
}
