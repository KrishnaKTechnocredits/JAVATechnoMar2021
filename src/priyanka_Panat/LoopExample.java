package priyanka_Panat;

/*
 Assignment 8
 */

class LoopExample{
	void evenNum(int startindex,int endindex){
		int i=10;
		System.out.println("Even Numbers between "+startindex+" and "+endindex+" are:");
		while(i<=endindex){
			if(i%2==0){		
				System.out.println(i + " ");
			}
			i++;
	    }
	}
	
	void divisibleByFive(int startindex,int endindex){
		int i=10;
		System.out.println("Numbers divisible by 5 are:");
		while(i<=endindex){
			if(i%5==0){
				System.out.println(i + " ");
			}
			i++;
		}
	}
	
	void divisibleByFiveandThree(int startindex,int endindex){
		int i=5;
		System.out.println("Numbers divisible by 5 and 3 are:");
		while(i<=endindex){
			if((i%5==0) && (i%3==0)){
				System.out.println(i + " ");
			}
			i++;
		}
	} 
	
	void divisibleBySevenandThirteen(int startindex,int endindex){
		System.out.println("Numbers divisible by 5 and 40 are:");
		int i=5;
		while(i<=endindex){
			if(i%7==0){
					System.out.println(+ i + " is divisible by 7" + " ");
			}
			else if((i%13==0)){
				System.out.println(+ i + " is divisible by 13" + " ");
		    }
			i++;
	    } 	
	}
	
	public static void main(String[] args){
		LoopExample LoopExample1=new LoopExample();
		System.out.println("----------------------------------");
		LoopExample1.evenNum(10,15);
		System.out.println("----------------------------------");
		LoopExample1.divisibleByFive(10,30);
		System.out.println("----------------------------------");
		LoopExample1.divisibleByFiveandThree(5,18);
		System.out.println("----------------------------------");
		LoopExample1.divisibleBySevenandThirteen(5,40);
		}
}
	