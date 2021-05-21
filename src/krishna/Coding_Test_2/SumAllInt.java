package krishna.Coding_Test_2;

public class SumAllInt {

	void sumInt(String name) {
		int digit = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);

			if (Character.isDigit(ch)) {
				int innerIndex = index + 1;
				index = innerIndex;
				char innerCh = name.charAt(innerIndex);

				if (Character.isDigit(innerCh)) {
					String combineNum = Character.toString(ch) + Character.toString(innerCh);
					digit = digit + Integer.parseInt(String.valueOf(combineNum));
				} else {

					digit = digit + Integer.parseInt(String.valueOf(ch));

				}

			}

		}
		System.out.println("Sum of digit in String is  :" + digit);

	}

	public static void main(String[] args) {
		SumAllInt sumAllInt = new SumAllInt();
		String name = "12h14i4w8sdc15";
		sumAllInt.sumInt(name);
	}

}
