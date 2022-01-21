package amrutaM.Assignment31;

/*Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ */
public class P4_PerfectNumbersInRange {
	static void isPerfectNumber(int number) {
		int sum =1;
		for (int index = 2; index <= number / 2; index++) {
			if(number%index==0) {
				sum+=index;
			}
		}
		//System.out.println(sum);
		if(sum==number)
			System.out.println(number + " Number is a perfect number!!");
		
	}

	static void getAllPerfectNumbers(int startRange, int endRange) {
		for (int index = startRange; index < endRange; index++) {
			isPerfectNumber(index);
		}

	}

	public static void main(String[] args) {
		getAllPerfectNumbers(1, 100);
	}

}
