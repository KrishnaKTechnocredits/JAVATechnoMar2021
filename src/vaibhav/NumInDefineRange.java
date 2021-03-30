package vaibhav;

public class NumInDefineRange {
		
	void evenNumber(int startNum,int endNum){
		System.out.println("User defiend range to find even numbers is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Even Numbers in the defined range are : ");
			for(int i=startNum; i<= endNum; i++) {
				if (i%2 == 0) {
				System.out.println(i++);
				}
			}				
		}	
	}
	
	
	void numDivisibleByFive(int startNum,int endNum){
		System.out.println("User defiend range to find number devisible by 5 is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0, as 0 is divisible by all numbers");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Numbers divisible by 5 in the defined range are : ");
			for(int i=startNum; i<= endNum; i++) {
				if (i%5 == 0) {
				System.out.println(i++);
				}
			}				
		}	
	}
	
	void numDivisibleByFiveAndThree(int startNum,int endNum){
		System.out.println("User defiend range to find number devisible by 5 and 3 is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0, as 0 is divisible by all numbers");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Numbers whcih are divisible by 5 & 3 in the defined range are : ");
			for(int i=startNum; i<= endNum; i++) {
				if ((i%5 == 0) &&(i%3 ==0)) {
				System.out.println(i++);
				}
			}				
		}	
	}
	
	void numDivisibleBySevenOrThirteen(int startNum,int endNum){
		System.out.println("User defiend range to find number devisible by 7 or 13 is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0, as 0 is divisible by all numbers");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Numbers whcih are divisible by 7 or 13 in the defined range are : ");
			for(int i=startNum; i<= endNum; i++) {
				if (i%7 ==0 || i%13 ==0) {
					if (i%7 == 0)
					System.out.println(i++ + " is divisible by 7");
					if (i%13 == 0)
					System.out.println(i++ + " is divisible by 13");
				}
			}				
		}	
	}
	
		
	public static void main(String[] args) {
		NumInDefineRange numInDefineRange = new NumInDefineRange();
		numInDefineRange.evenNumber(10,15);
		numInDefineRange.numDivisibleByFive(10, 30);
		numInDefineRange.numDivisibleByFiveAndThree(5, 18);
		numInDefineRange.numDivisibleBySevenOrThirteen(5,40);
	}
}
