package neha_Patil;

public class Maths {
	int index, startIndex, endIndex;
	void evenNumber(int startIndex, int endIndex) {
		for(int index = startIndex;index <= endIndex;index++) 
			if(index%3 ==0)
				System.out.println("Even numbers are: " +index);
	}

	void five(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++)
			if(index%5==0)
				System.out.println("Number divisible by 5 are : " +index);

	}

	void fiveAndThree(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++)
			if(index%5==0 && index%3==0)
				System.out.println("Number divisible by 5 and 3 are : " +index);
	}

	void sevenOrThirteen(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++)
			if(index%7==0 || index%13==0)
				System.out.println("Numbers divisible by 7 or 13 are: " +index);
	}

	public static void main(String[] args){
		Maths m= new Maths();
		m.evenNumber(10,14);
	    m.five(20,30);
	    m.fiveAndThree(5,18);
	    m.sevenOrThirteen(5,29);
	}


}
