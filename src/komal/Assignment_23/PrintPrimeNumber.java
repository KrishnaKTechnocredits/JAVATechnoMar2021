package komal.Assignment_23;
/*2) print all the prime numbers given range.
   input : 40 to 100
   output :*/

public class PrintPrimeNumber {
	
	void printPrimeNum(int startRange, int endRange) {
		String strPrimeNum = "";
		System.out.println("Below are prime numbers between " + startRange + " and " + endRange);
		for (int index = startRange; index < endRange; index++) {
			String isPrimeNum = validatePrimeNum(index);
			if (isPrimeNum == "Yes") {
				if (strPrimeNum != "") {
					strPrimeNum += ",";
				}
				strPrimeNum += index;
			}
		}
		System.out.println(strPrimeNum);
	}

	String validatePrimeNum(int num) {
		String isPrime = "Yes";
		if (num == 0 || num == 1) {
			isPrime = "No";
		} else {
			for (int index = 2; index < num; index++) {
				if (num % index == 0) {
					isPrime = "No";
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		PrintPrimeNumber printNum = new PrintPrimeNumber();
		printNum.printPrimeNum(40, 100);
	}
}
