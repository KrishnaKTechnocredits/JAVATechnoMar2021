package sandesh.Assignment_17;

public class IndexOfMaxLengthStringFromArray {

	int getIndexOfMaxLengthString(String[] inArray) {
		String maxLengthString = inArray[0];
		int indexOfMaxLengthString = 0;
		for(int index=1; index<inArray.length; index++) {
			if(maxLengthString.length() < inArray[index].length()) {
				//maxLengthString = inArray[index];
				indexOfMaxLengthString = index;
			}
		}
		//System.out.println(maxLengthString);
		return indexOfMaxLengthString;
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		int indexOfMaximumLengthString = new IndexOfMaxLengthStringFromArray().getIndexOfMaxLengthString(inputArray);
		System.out.println("Index of maximum length's string is -: " + indexOfMaximumLengthString);
	}
}
