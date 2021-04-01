package trupti;
//Assignment 6 :Write only one program having following methods.
public class NumberRange {
	
	void displayEven(int startIndex,int endIndex) {
		int i;
			for(i=10;i<=15;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
	}
	
	void displayDiv5(int startIndex,int endIndex) {
		int i;
			for(i=10;i<=30;i++) {
				if(i%5==0) {
					System.out.println(i);
				}
			}
	}
	
	void displayDiv5Div3(int startIndex,int endIndex) {
		int i;
			for(i=5;i<=18;i++) {
				if(i%3==0 && i%5==0)
					System.out.println(i);
			}
	}
	void displayDiv7Div13(int startIndex,int endIndex) {
		int i;
		
			for(i=5;i<=40;i++) {
				if(i%7==0)
					System.out.println(i+" is divisible by "+"7");
				if(i%13==0)
					System.out.println(i+" is divisible by "+"13");
			}
	}
	
	public static void main(String[] args) {
		NumberRange numberrange=new NumberRange();
		System.out.println("Even numbers are :");
		numberrange.displayEven(10,15);
		System.out.println("-------------------------------");
		System.out.println("Divisible by 5,numbers are :");
		numberrange.displayDiv5(10,30);
		System.out.println("-------------------------------");
		System.out.println("Divisible by 5 & 3,numbers are :");
		numberrange.displayDiv5Div3(5,18);
		System.out.println("-------------------------------");
		System.out.println("Divisible by 7 & 13,numbers are :");
		numberrange.displayDiv7Div13(5,40);

	}

}
