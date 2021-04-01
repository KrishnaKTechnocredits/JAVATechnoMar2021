package surabhi;

public class WhileNumberRange {

	void findEvenNumber(int startIndex, int endIndex) {

		if(startIndex>=0 && startIndex<endIndex) {
			System.out.println("Even Numbers are:-");
			int index=startIndex;
			while(index<=endIndex){	
				if(index%2==0) {
					System.out.println(index);
				}	
				index++;
			}
		}else {
			System.out.println("Input range is invalid");
		}


	}

	void findNumberDivisibleBy5(int startIndex, int endIndex) {

		if(startIndex>=0 && startIndex<endIndex) {
			System.out.println("Divisible by 5, numbers are:-");
			int index=startIndex;
			while(index<=endIndex) {
				if(index%5==0) {
					System.out.println(index);
				}		
				index++;
			}
		}else {
			System.out.println("Input range is invalid");
		}		

	}

	void findNumberDivisibleBy5and3(int startIndex, int endIndex) {

		if(startIndex>=0 && startIndex<endIndex) {
			System.out.println("Divisible by 5 and 3, numbers are:-");
			int index=startIndex;
			while(index<=endIndex) {
				if(index%5==0 && index%3==0) {
					System.out.println(index);
				}		
				index++;
			}
		}else {
			System.out.println("Input range is invalid");
		}		

	}

	void findNumberDivisibleBy7and13(int startIndex, int endIndex) {

		if(startIndex>=0 && startIndex<endIndex) {		
			System.out.println("Divisible by 7 or 13, numbers are:-");
			int index=startIndex;
			while(index<=endIndex) {
				if(index%7==0) {
					System.out.println(index+" is divisible by 7 ");
				}	
				if(index%13==0) {
					System.out.println(index+" is divisible by 13 ");
				}
				index++;
			}
		}else {
			System.out.println("Input range is invalid");
		}		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileNumberRange whileNumberRange=new WhileNumberRange();
		whileNumberRange.findEvenNumber(1, 10);
		whileNumberRange.findNumberDivisibleBy5(10, 30);
		whileNumberRange.findNumberDivisibleBy5and3(5, 18);
		whileNumberRange.findNumberDivisibleBy7and13(5, 40);

	}

}
