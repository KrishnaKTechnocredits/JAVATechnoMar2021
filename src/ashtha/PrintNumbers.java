package ashtha;

public class PrintNumbers {
	int start;
	int end;
	
	void printEvenNumbers (int startIndex, int endIndex ) {
		start = startIndex;
		end = endIndex;
		for(start=startIndex; start<=endIndex; start++){
			if (start%2==0) {
				System.out.println(start);
			}			
		}
	}
	
	void printMultipleOfFive (int startIndex, int endIndex) {
		start = startIndex;
		end = endIndex;
		for(start=startIndex; start<=endIndex; start++) {
			if(start%5==0) {
				System.out.println(start);
			}
		}	
	}
	
	void printMultipleofFiveAndThree (int startIndex, int endIndex) {
		start = startIndex;
		end = endIndex;
		for(start=startIndex; start<=endIndex; start++) {
			if(start%3==0 && start%5==0) {
				System.out.println(start);
			}
		}
	}
	
	void printMultipleofSevenOrThirteen (int startIndex, int endIndex) {
		start = startIndex;
		end = endIndex;
		for(start=startIndex; start<=endIndex; start++) {
			if(start%7==0) {
				System.out.println(start+" is divisible by 7");
			}else if(start%13==0) {
				System.out.println(start+" is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();
		System.out.println("The even numbers are:");
		printNumbers.printEvenNumbers(10,15);
		System.out.println("The numbers divisible by 5 are:");
		printNumbers.printMultipleOfFive(10,30);
		System.out.println("The numbers divisible by 3 and 5 are:");
		printNumbers.printMultipleofFiveAndThree(5,18);
		System.out.println("The numbers divisible by 7 and 13 are:");
		printNumbers.printMultipleofSevenOrThirteen(5,40);	
	}
}
