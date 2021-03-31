package surabhi;

public class NumberRange {
	
	void findEvenNumber(int startIndex, int endIndex) {
		
		if(startIndex>=0 && startIndex<endIndex) {
			System.out.println("Even Numbers are:-");
			for(int index=startIndex; index<=endIndex; index++) {
				if(index%2==0) {
					System.out.println(index);
				}		
			}
		}else {
			System.out.println("Input range is invalid");
		}

		
	}
	
	void findNumberDivisibleBy5(int startIndex, int endIndex) {
		
		if(startIndex>=0 && startIndex<endIndex) {
			System.out.println("Divisible by 5, numbers are:-");
			for(int index=startIndex; index<=endIndex; index++) {
				if(index%5==0) {
					System.out.println(index);
				}		
			}
		}else {
			System.out.println("Input range is invalid");
		}		
		
	}
	
	void findNumberDivisibleBy5and3(int startIndex, int endIndex) {
		
		if(startIndex>=0 && startIndex<endIndex) {
			System.out.println("Divisible by 5 and 3, numbers are:-");
			for(int index=startIndex; index<=endIndex; index++) {
				if(index%5==0 && index%3==0) {
					System.out.println(index);
				}		
			}
		}else {
			System.out.println("Input range is invalid");
		}		
		
	}
	
	void findNumberDivisibleBy7and13(int startIndex, int endIndex) {
		
		if(startIndex>=0 && startIndex<endIndex) {		
			System.out.println("Divisible by 7 or 13, numbers are:-");
			for(int index=startIndex; index<=endIndex; index++) {
				if(index%7==0) {
					System.out.println(index+" is divisible by 7 ");
				}	
				if(index%13==0) {
					System.out.println(index+" is divisible by 13 ");
				}
			}
		}else {
			System.out.println("Input range is invalid");
		}		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberRange numberRange=new NumberRange();
		numberRange.findEvenNumber(2, 10);
		numberRange.findNumberDivisibleBy5(10, 30);
		numberRange.findNumberDivisibleBy5and3(5, 18);
		numberRange.findNumberDivisibleBy7and13(5, 40);
	}

}
