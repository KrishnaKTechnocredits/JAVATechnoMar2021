package prachi.Assignment_17;

/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class ArrMaxStringNameIndex {
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
		ArrMaxStringNameIndex maxLengthIndex = new ArrMaxStringNameIndex();
		int index =  maxLengthIndex.getMaxLengthIndex(personName);
		System.out.println("Name with maximum character length is at "+index+ "nd index.");
	}
}
