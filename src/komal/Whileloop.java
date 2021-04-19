//Assignment_No_8
package komal;

public class Whileloop{

	void evenOdd(int startRange,int endRange){
		System.out.println("Even numbers are: ");
			while(startRange <= endRange){
				if(startRange % 2 == 0)
				System.out.println(startRange);
				startRange++;
			}
	}
	void divisibleBy5(int startRange,int endRange){
		System.out.println("Numbers divisible by 5 are:");
		while(startRange <= endRange){
			if(startRange % 5 == 0)
				System.out.println(startRange);
				startRange++;
			}
	}
	void divisibleBy5And3(int startRange, int endRange) {
		System.out.println("Numbers divisible by 5 and 3 are:");
		while(startRange <= endRange) {
			if(startRange % 5 == 0 && startRange % 3 == 0)
				System.out.println(startRange);
			startRange++;
		}
	}

	void divisibleBy7Or13(int startRange,int endRange) {
		System.out.println("Number divisible by 7 or 13 are:");
		while(startRange <= endRange) {
			if(startRange % 7 == 0)
				System.out.println(startRange+" is divisible by 7");
			else {
				if(startRange % 13 == 0)
					System.out.println(startRange+" is divisible by 13");
			}	
			startRange++;
		}	
	}

	public static void main(String[] args) {
		Whileloop whileloop = new Whileloop();
		whileloop.evenOdd(10, 15);
		whileloop.divisibleBy5(10, 30);
		whileloop.divisibleBy5And3(5, 18);
		whileloop.divisibleBy7Or13(5, 40);
	}
}
	