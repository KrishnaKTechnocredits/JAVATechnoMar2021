package krati_Shukla;

public class Number1 {
	
	void displayEven(int startIndex,int endIndex) {
		System.out.println("Even numbers are : ");
		while(startIndex<=endIndex) {
			System.out.println(startIndex);
			startIndex=startIndex+2;
		}
	}
		
	void displayDiv1(int startIndex,int endIndex) {
		System.out.println("Numbers divisble by 5 are :");
		while(startIndex<=endIndex) {
			if (startIndex%5 == 0)
			{
				System.out.println(+startIndex+ " ");
			}
			startIndex++;
		}
	}
		
	void displaydiv2(int startIndex,int endIndex) {
		while(startIndex<=endIndex) {
			if (startIndex%5 == 0 && startIndex%3 ==0){
			System.out.println("Number divisble by 5 & 3 are : " +startIndex+ " ");
			}
			startIndex++;
		}
	}
	
	void displaydiv3(int startIndex,int endIndex) {
		while(startIndex<=endIndex) {
			if (startIndex%7 == 0){
			System.out.println(startIndex+" is divisble by 7");
			}
			if (startIndex%13 == 0){
				System.out.println(startIndex+" is divisble by 13");
			}	
			startIndex++;
		}
	}
	public static void main(String[] a) {
		Number1 number1 = new Number1();
		number1.displayEven(10,15);
		number1.displayDiv1(10,30);
		number1.displaydiv2(5,18);
		number1.displaydiv3(5,40);
	}

}