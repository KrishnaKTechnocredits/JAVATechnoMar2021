package radha;

public class Assignment8 {
	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers between "+startIndex+ " and "+endIndex+" are: ");
		while (startIndex<=endIndex) {
			if(startIndex%2==0)
				System.out.println(startIndex);
			startIndex++;
		}
	}
	
	void divByFive(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, Numbers between "+startIndex+ " and "+endIndex+" are: ");
		while (startIndex<=endIndex) {
			if(startIndex%5==0)
				System.out.println(startIndex);
			startIndex++;
		}
	}
	
	void fiveAndThree(int startIndex, int endIndex) {
		System.out.println("Divisible by 3 and 5, Numbers between "+startIndex+ " and "+endIndex+" are: ");
		while (startIndex<=endIndex) {
			if(startIndex%5==0 && startIndex%3==0)
				System.out.println(startIndex);
			startIndex++;
		}
	}
	
	void sevenAndThirteen(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, Numbers between "+startIndex+ " and "+endIndex+" are: ");
		while (startIndex<=endIndex) {
			if(startIndex%7==0)
				System.out.println(startIndex +" is divisible by 7");
			else if(startIndex%13==0)
				System.out.println(startIndex +" is divisible by 13");
			startIndex++;
		}
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.evenNumbers(10, 15);
		assignment8.divByFive(10, 30);
		assignment8.fiveAndThree(5, 18);
		assignment8.sevenAndThirteen(5, 40);
	}
}
