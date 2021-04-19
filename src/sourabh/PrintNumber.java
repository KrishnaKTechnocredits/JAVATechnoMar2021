package sourabh;

public class PrintNumber {
	int startnumber;
	int endnumber;
	void  printEvenNumber(int getfirstnumber, int getendnumber) {
		startnumber= getfirstnumber;
		endnumber= getendnumber;
		for(int i= startnumber; i<=endnumber; i++)
		{
			if(i %2 == 0)
				System.out.println(i);
		}
	}
	void  printDivisibleBy5(int getfirstnumber, int getendnumber) {
		startnumber= getfirstnumber;
		endnumber= getendnumber;
		for(int i= startnumber; i<=endnumber; i++)
		{
			if(i %5 == 0)
				System.out.println(i);
		}
	}
	void  printDivisibleBy5and3(int getfirstnumber, int getendnumber) {
		startnumber= getfirstnumber;
		endnumber= getendnumber;
		for(int i= startnumber; i<=endnumber; i++)
		{
			if(i %5 == 0 && i%3 == 0)
				System.out.println(i);
		}
	}
	void  printDivisibleBy7or13(int getfirstnumber, int getendnumber) {
		startnumber= getfirstnumber;
		endnumber= getendnumber;
		for(int i= startnumber; i<=endnumber; i++)
		{
			if(i %7 == 0)
				System.out.println(i+ " is divisible by 7");
			else if(i%13 == 0)
				System.out.println(i+ " is divisible by 13");
		}
		
	}
	public static void main(String[] args) {
		PrintNumber printNumber= new PrintNumber();
		printNumber.printEvenNumber(10, 15);
		System.out.println("***************************");
		printNumber.printDivisibleBy5(10, 30);
		System.out.println("***************************");
		printNumber.printDivisibleBy5and3(5, 18);
		System.out.println("***************************");
		printNumber.printDivisibleBy7or13(5, 40);
	}
}
