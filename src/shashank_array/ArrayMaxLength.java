package shashank_array;

public class ArrayMaxLength {

	public String maxLength(String array[]) {
		int maxLength = 0;
		int temp = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index].length() > maxLength) {
				maxLength = array[index].length();
				temp = index;
			}
		}
		return array[temp];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		ArrayMaxLength maxLength = new ArrayMaxLength();
		String maxStr = maxLength.maxLength(array);
		System.out.println("The name having maximum length is " + maxStr);
	}

}
