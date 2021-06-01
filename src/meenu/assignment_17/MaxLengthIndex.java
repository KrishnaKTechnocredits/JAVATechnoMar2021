package meenu.assignment_17;

/*return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/

public class MaxLengthIndex {
	
	int getMaxLengthIndex(String[] personName) {
		int maxIndex = 0;
		int maxIndexLength = personName[0].length();
		for(int index = 1;index<personName.length;index++) {
			if(maxIndexLength < personName[index].length()) {
				maxIndexLength = personName[index].length();
				maxIndex = index;
				}
		}
			return maxIndex;
	}
	public static void main(String[] args) {
		String[] personName = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		MaxLengthIndex maxLengthIndex = new MaxLengthIndex();
		int index =  maxLengthIndex.getMaxLengthIndex(personName);
		System.out.println("Index with maximum length from given array is : "+index);
	}

}
