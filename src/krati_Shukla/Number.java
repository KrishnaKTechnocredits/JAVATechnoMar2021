package krati_Shukla;

public class Number {
	
	void displayEven(int startIndex,int endIndex) {
		System.out.println("Even numbers are : ");
		for (int i=startIndex; i<=endIndex; i++) {
			if (i%2 == 0)
				System.out.println(i);
		}
	}
		
	void displayDiv1(int startIndex,int endIndex) {
		System.out.println("Numbers divisble by 5 are :");
		for (int i = startIndex; i <= endIndex; i = i+1) {
			if (i%5 == 0)
			{
				System.out.println(+i+ " ");
			}
		}
	}
		
	void displaydiv2(int startIndex,int endIndex) {
		for (int i = startIndex; i <= endIndex; i = i+1) {
			if (i%5 == 0 && i%3 ==0){
			System.out.println("Number divisble by 5 & 3 are : " +i+ " ");
			}
		}
	}
	
	void displaydiv3(int startIndex,int endIndex) {
		for (int i = startIndex; i <= 40; i = i+1) {
			if (i%7 == 0){
			System.out.println(i+" is divisble by 7");
			}
			if (i%13 == 0){
				System.out.println(i+" is divisble by 13");
			}	
		}
	}
	public static void main(String[] a) {
		Number number = new Number();
		number.displayEven(10,15);
		number.displayDiv1(10,30);
		number.displaydiv2(5,18);
		number.displaydiv3(5,40);
	}

}
