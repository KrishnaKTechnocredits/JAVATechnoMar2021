package kapil.Array;

public class BiggestName {

	void getBiggerString(String[] arrElement) {

		System.out.println("Bigger String : ");
		String biggerString = arrElement[0];
		for (int index = 1; index < arrElement.length; index++) {
			if (biggerString.length() < arrElement[index].length())
				biggerString = arrElement[index];
		}
		{
			System.out.println("Biggest String is " + biggerString);
		}
	}

	public static void main(String[] args) {
		BiggestName biggestname = new BiggestName();
		String nameArr[] = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		biggestname.getBiggerString(nameArr);
	}
}