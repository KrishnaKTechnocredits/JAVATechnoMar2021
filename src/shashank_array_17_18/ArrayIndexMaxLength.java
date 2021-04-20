package shashank_array_17_18;

public class ArrayIndexMaxLength {

	public int maxLengthIndex(String array[]) {
		int maxLength = 0;
		int temp = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index].length() > maxLength) {
				maxLength = array[index].length();
				temp = index;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		ArrayIndexMaxLength maxLengthIndex = new ArrayIndexMaxLength();
		int maxStrIndex = maxLengthIndex.maxLengthIndex(array);
		System.out.println("The index of name having maximum length is " + maxStrIndex);
	}
}
