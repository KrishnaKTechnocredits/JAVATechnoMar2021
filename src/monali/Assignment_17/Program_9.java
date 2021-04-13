package monali.Assignment_17;

public class Program_9 {

	int maxLengthStringIndex(String[] names) {
		int BiggestStringIndex = 0;
		String BiggestString = names[0];
		for (int index = 1; index < names.length; index++) {
			if (BiggestString.length() < names[index].length())
				BiggestStringIndex = index;

		}
		System.out.println("Index of biggest String in the given array is " + BiggestStringIndex);
		return BiggestStringIndex;
	}

	public static void main(String[] a) {
		String names[] = { "monali", "tondare", "pune" };
		for (int index = 0; index < names.length; index++) {
		}
		Program_9 program = new Program_9();
		program.maxLengthStringIndex(names);
	}

}
