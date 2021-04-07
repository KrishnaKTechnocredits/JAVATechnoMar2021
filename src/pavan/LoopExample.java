package pavan;

public class LoopExample {
	
	void ModOftwo(int startlimit,int endlimit){
		for(int index= startlimit; index<= endlimit;index =index+1){
			if(index%2 ==0){
				System.out.println("Even numbers are"+ index);					
			}		
		}
	}	
	
	
	void RangeOfNumbers(int startlimit,int endlimit){
		for(int index= startlimit; index<= endlimit;index =index+1){
			if(index%5 ==0){
				System.out.println("Devisible numbers are "+ index);				
			}
		}
	}
	
	
	void DevisibleAndNumber(int startlimit,int endlimit){
		for(int index= startlimit; index<= endlimit;index =index+1){
				if(index%5 ==0&& index%3==0){
				System.out.println("Devisible numbers are "+ index);			
			}	
		}
	}


	void DivisiableOrNumber(int startlimit,int endlimit) {
			for(int index= startlimit; index<= endlimit;index =index+1){
					if(index%7 ==0 || index%13==0){
					System.out.println(index+" "+"Devisible numbers are "+ index);					
				}		
			}
		}	
	public static void main(String[]Args){
		LoopExample loopExample= new LoopExample();
		loopExample.ModOftwo(10,15);
		loopExample.RangeOfNumbers(10,30);
		loopExample.DevisibleAndNumber(5,18);
		loopExample.DivisiableOrNumber(5,40);
		
	}
}