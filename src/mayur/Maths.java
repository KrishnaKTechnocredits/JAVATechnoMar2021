package mayur;

public class Maths {
	int index, startIndex, endIndex;
	void evenNumber(int startIndex, int endIndex) { 
			System.out.println("Even numbers are: " );
		int index = startIndex;
		while(index<=endIndex) {
			if(index%2==0) {
				System.out.println(+index);
			}
			index++;
		}
	}
	
	void five(int startIndex, int endIndex) {
			System.out.println("Number divisible by 5 are : ");
		int index = startIndex;
		while(index<=endIndex) {
			if(index%5==0) {
				System.out.println(+index);
			}
			index++;
		}
	}

	void fiveAndThree(int startIndex, int endIndex) {
		System.out.println("Number divisible by 5 and 3 are : ");
		int index=startIndex;
		while(index<=endIndex) {
			if(index%5==0 && index%3==0) {
				System.out.println(+index);
			}
			index++;
		}
	}

	void sevenOrThirteen(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 7 or 13 are: ");
		int index=startIndex;
		while(index<=endIndex) {
			if(index%7==0 || index%13==0) {
				System.out.println(+index);
			}
			index++;
		}
	}

	public static void main(String[] args){
		Maths maths = new Maths();
		maths.evenNumber(10,15);
	    maths.five(10,30);
	    maths.fiveAndThree(5,18);
	    maths.sevenOrThirteen(5,40);
	}
}
