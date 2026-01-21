package amrutaM.javaBasics;

/*Program 2:* 
Write a method to find out required numbers to generate sum more than 100. 
output : 14
*/
public class SumMoreThan100 {
	void getSum() {
		int sum = 0;
		int index = 1;
		while (sum <= 100) {
			sum += index;
			System.out.println(index);
			index++;
		}
	}

	public static void main(String[] args) {
		SumMoreThan100 sumMoreThan100 = new SumMoreThan100();
		sumMoreThan100.getSum();
	}
}
