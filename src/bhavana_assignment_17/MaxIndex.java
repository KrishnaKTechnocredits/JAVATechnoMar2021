package bhavana_assignment_17;

/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/


public class MaxIndex{

	int findIndexofMaxLengthName(String[] array) {
		int maxIndex = 0;
		int maxLength = array[0].length();
		for (int index = 1; index < array.length; index++) {
			if (array[index].length() > maxLength) {
				maxLength = array[index].length();
				maxIndex = index;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		String[] arr = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		System.out.println("Index having max length is:"+new MaxIndex().findIndexofMaxLengthName(arr));
	}
}
