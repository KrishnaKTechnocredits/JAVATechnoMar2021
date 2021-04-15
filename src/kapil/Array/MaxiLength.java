package kapil.Array;

public class MaxiLength {

	void getBiggerString(String[] arrElement) {

		System.out.println("what is biggest string index  ? ");
		int biggerStringindex = 0;
		String biggerString = arrElement[0];
		for (int index = 1; index < arrElement.length; index++) {
			if (biggerString.length() < arrElement[index].length())
				biggerStringindex = index;

		}
		{
			System.out.println("Biggest String index : " + biggerStringindex);
		}
	}

	public static void main(String[] args) {
		MaxiLength maxilength = new MaxiLength();
		String nameArr[] = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		maxilength.getBiggerString(nameArr);
	}
}
