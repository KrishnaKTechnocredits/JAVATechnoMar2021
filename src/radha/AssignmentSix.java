package radha;

public class AssignmentSix {
	
	void evenNumbers(int startIndex, int endIndex) {
		int i;
		System.out.println("Even numbers between "+startIndex+ " and "+endIndex+" are: ");
		for (i=startIndex;i<=endIndex;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	void divByFive(int startIndex, int endIndex) {
		int i;
		System.out.println("Divisible by 5, Numbers between "+startIndex+ " and "+endIndex+" are: ");
		for (i=startIndex;i<=endIndex;i++) {
			if(i%5==0)
				System.out.println(i);
		}
	}
	
	void fiveAndThree(int startIndex, int endIndex) {
		int i;
		System.out.println("Divisible by 3 and 5, Numbers between "+startIndex+ " and "+endIndex+" are: ");
		for (i=startIndex;i<=endIndex;i++) {
			if(i%5==0 && i%3==0)
				System.out.println(i);
		}
	}
	
	void sevenAndThirteen(int startIndex, int endIndex) {
		int i;
		System.out.println("Divisible by 7 or 13, Numbers between "+startIndex+ " and "+endIndex+" are: ");
		for (i=startIndex;i<=endIndex;i++) {
			if(i%7==0)
				System.out.println(i +" is divisible by 7");
			else if(i%13==0)
				System.out.println(i +" is divisible by 13");
		}
	}
	
	public static void main(String[] args) {
		AssignmentSix assignment6 = new AssignmentSix();
		assignment6.evenNumbers(10, 15);
		assignment6.divByFive(10, 30);
		assignment6.fiveAndThree(5, 18);
		assignment6.sevenAndThirteen(5, 91);
	}
}
