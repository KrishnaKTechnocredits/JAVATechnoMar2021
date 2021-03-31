package amruta;

class CalculatorOperation{
	int startindex;
	int endindex;
	
	void displayevenNumber(int startno, int endno){
		startindex = startno;
		endindex = endno;
		
		System.out.println("Even Numbers are :");
		
		for(startindex=1;startindex<=endindex;startindex++){
			
			if(startindex%2==0){
				System.out.println(startindex);
			}
		}
	}
	
	void divisiblebyFive(int startno, int endno){
		startindex = startno;
		endindex = endno;
		
		System.out.println("Numbers Divisible by 5 are :");
		
		for(startindex=1;startindex<=endindex;startindex++){
			if(startindex%5==0){
				System.out.println(startindex);
			}
		}
	}
	
	void divisiblebyFiveandThree(int startno, int endno){
		startindex = startno;
		endindex = endno;
		
		System.out.println("Numbers Divisible by 5 and 3 are :");
		
		for(startindex=1;startindex<=endindex;startindex++){
			if(startindex%5==0 || startindex%3==0){
				System.out.println(startindex);
			}
		}
	}
	
	void divisiblebySevenandThirteen(int startno, int endno){
		startindex = startno;
		endindex = endno;
		System.out.println("Numbers Divisible by 7 and 13 are :");
		for(startindex=1;startindex<=endindex;startindex++){
			if(startindex%7==0 || startindex%13==0){
				System.out.println(startindex);
			}
		}
	}
	
	public static void main(String[] args){
	CalculatorOperation calculatoroperation = new CalculatorOperation();
	calculatoroperation.displayevenNumber(10,15);
	calculatoroperation.divisiblebyFive(10,30);
	calculatoroperation.divisiblebyFiveandThree(5,18);
	calculatoroperation.divisiblebySevenandThirteen(5,40);
	}
}
