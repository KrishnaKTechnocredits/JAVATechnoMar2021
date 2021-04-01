package priyanka_Panat; 
/*
 Assignment No-6
 */
class Numbers{
	
	void evenNum(int startindex,int endindex){
		System.out.println("Even Numbers between "+startindex+" and "+endindex+" are:");
		for(int i=startindex;i<=endindex;i++){
			if(i%2==0){		
				System.out.println(i + " ");
		    }
	    }
	}
	
	void divisibleByFive(int startindex,int endindex){
		System.out.println("Numbers divisible by "+startindex+" and "+endindex+" are:");
		for(int i=startindex;i<=endindex;i++){
			if(i%5==0){
				System.out.println(i + " ");
			}
		}
	}
	
	void divisibleByFiveandThree(int startindex,int endindex){
		System.out.println("Numbers divisible by 5 and 3 are:");
		for(int i=startindex;i<=endindex;i++){
			if((i%5==0) && (i%3==0)){
				System.out.println(i + " ");
			}
		}
	} 
			
	void divisibleBySevenandThirteen(int startindex,int endindex){
		System.out.println("Numbers divisible by 5 and 40 are:");
		for(int i=startindex;i<=endindex;i++){
			if(i%7==0){
					System.out.println(+ i + " is divisible by 7" + " ");
			}
			else if((i%13==0)){
				System.out.println(+ i + " is divisible by 13" + " ");
		    }
	    } 	
	}
		
	public static void main(String[] args){
		Numbers n1=new Numbers();
		n1.evenNum(10,15);
		n1.divisibleByFive(10,30);
		n1.divisibleByFiveandThree(5,18);
		n1.divisibleBySevenandThirteen(5,40);
	}
}
		
			
			