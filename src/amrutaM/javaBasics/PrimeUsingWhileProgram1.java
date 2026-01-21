package amrutaM.javaBasics;

/*Program 1:* Print first N prime numbers. N should be passed as parameter in the method. 
Hint : 10 pass as parameter, method should print first 10 prime numbers. 
*/
public class PrimeUsingWhileProgram1 {

	void firstNPrimeNumbers(int number) {
		
		int count = 0;
		int index = 1;
		while (number != count) {
			if (index % 2 != 0) {
				System.out.println(index);
				count++;
			}
			index++;
		}
	}

	public static void main(String[] args) {
		PrimeUsingWhileProgram1 primeUsingWhileProgram1 = new PrimeUsingWhileProgram1();
		primeUsingWhileProgram1.firstNPrimeNumbers(10);
	}
}
