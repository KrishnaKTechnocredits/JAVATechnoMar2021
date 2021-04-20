package shashank_Assignment_6_11;

public class NumberRangeOperationWhile {
	public void evenNumber(int startIndex, int endIndex) {
		System.out.println("Even Numbers in given range " + startIndex + " and " + endIndex + " are follows:-");
		int index=startIndex;
		while(index<=endIndex) {
				if (index % 2 == 0)
					System.out.print(index + " ");
				index++;
			}
		}
	
	public void divisibleByFive(int startIndex, int endIndex) {
		System.out.println(
				"\nNumbers divsible by 5 in given range " + startIndex + " and " + endIndex + " are follows:-");
			int index=startIndex;
			while(index<=endIndex) {
				if (index % 5 == 0)
					System.out.print(index + " ");
				index++;
			}
		
	}

	public void divisibleByFiveAndThree(int startIndex, int endIndex) {
		System.out.println(
				"\nNumbers divsible by 5 and 3 in given range " + startIndex + " and " + endIndex + " are follows:-");
		int index=startIndex;
		while(index<=endIndex) {
			if (index % 5 == 0 && index %3==0)
				System.out.print(index + " ");
			index++;
		}
	}

	public void divisibleBySevenAndThirteen(int startIndex, int endIndex) {
		System.out.println(
				"\nNumbers divsible by 7 and 13 in given range " + startIndex + " and " + endIndex + " are follows:-");
		int index=startIndex;
		while(index<=endIndex) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible 7 ");
			else if (index % 13 == 0)
				System.out.println(index +" is divisible 13");
			index++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberRangeOperationWhile numberRangeOperation = new NumberRangeOperationWhile();
		numberRangeOperation.evenNumber(10, 15);
		numberRangeOperation.divisibleByFive(10, 30);
		numberRangeOperation.divisibleByFiveAndThree(5, 18);
		numberRangeOperation.divisibleBySevenAndThirteen(5, 40);

	}

}
