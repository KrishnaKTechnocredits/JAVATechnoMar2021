package purva;

public class WhileLoopNumbersDiv {

	void evenNumber(int endNumber) {
	     int startNumber=1;
		 System.out.println("Even number are :");
		 while(startNumber<=endNumber) {
			 if(startNumber%2==0) 
			    System.out.println(startNumber);
			 startNumber++;
			
		  }
		 
	}
			
	void fiveDivisible(int endNumber) {
		int startNumber=10;
		System.out.println("Number divisible by 5 are :");
		while(startNumber<=endNumber) 
		{
			if(startNumber%5==0)
			    System.out.println(startNumber);
			startNumber++ ;
			
	    }
	}
			
	void fiveAndThree(int endNumber) {
		int startNumber=5;
		System.out.println("Number divisible by 5 and 3 are :");
		while(startNumber<=endNumber) {
		  if(startNumber%5==0 && startNumber%3==0) {
		    System.out.println(startNumber);}
		    startNumber++;
		    
		  }
			
		}
	
			
	void sevenOrThirteen(int endNumber1) {
		int startNumber =5;
		System.out.println("Divisible by 7 or 13, numbers are :");
		while(startNumber<=endNumber1) {
			if(startNumber%7==0) {
				System.out.println(startNumber +" is divisible by 7");}
			else if(startNumber%13==0) {
				System.out.println(startNumber +" is divisible by 13");}
	
			
		    startNumber++;
		   }
		
		}
			
			public static void main(String[] a){
				WhileLoopNumbersDiv whileLoopNumbersDiv = new WhileLoopNumbersDiv();
				whileLoopNumbersDiv.evenNumber(15);
				whileLoopNumbersDiv.fiveDivisible(30);
				whileLoopNumbersDiv.fiveAndThree(18);
				whileLoopNumbersDiv.sevenOrThirteen(40);
			}
	}


