package madhavi_Khasbage.AraryPrimeNumbers;

/**Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */

public class FindFirstFivePrimeNum {

	String printFivePrimeNum(int startRange, int endRange) {
		int cnt = 0;
		String strPrimeNum = "";

		for (int index = startRange; index < endRange; index++) {
			if (cnt == 5)
				break;
			String isPrimeNum = validatePrimeNum(index);
			if (isPrimeNum == "Yes") {
				cnt++;
				if (strPrimeNum != "") {
					strPrimeNum += ",";
				}
				strPrimeNum += index;
			}
		}
		return strPrimeNum;
	}

	String validatePrimeNum(int num) {
		String isPrime = "Yes";
		if (num == 0 || num == 1) {
			isPrime = "No";
		} else {
			for (int index = 2; index < num / 2; index++) {
				if (num % index == 0) {
					isPrime = "No";
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		FindFirstFivePrimeNum primNum = new FindFirstFivePrimeNum();
		System.out.println("Below are the first five prime numbers between 10 and 50");
		System.out.println(primNum.printFivePrimeNum(10, 50));
	}

}
