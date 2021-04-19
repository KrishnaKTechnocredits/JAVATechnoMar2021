package pavan;

public class LoopWhileExample {
	void ModOftwo(int startlimit,int endlimit){
		int index= startlimit;		
		while(index<= endlimit){
			if(index%2 ==0){
				System.out.println("Even numbers are"+ index);					
			}index =index+1;		
		}
	}		
	void RangeOfNumbers(int startlimit,int endlimit){
		int index= startlimit;
		while( index<= endlimit){
			if(index%5 ==0){
				System.out.println("Devisible numbers are "+ index);				
			}index =index+1;
		}
	}
	void DevisibleAndNumber(int startlimit,int endlimit){
		int index= startlimit;
		while( index<= endlimit){
				if(index%5 ==0&& index%3==0){
				System.out.println("Devisible numbers are "+ index);			
			}index =index+1;	
		}
	}
	void DivisiableOrNumber(int startlimit,int endlimit) {
		int index= startlimit;
			while( index<= endlimit){
					if(index%7 ==0 || index%13==0){
					System.out.println(index+" "+"Devisible numbers are "+ index);					
			}index =index+1;		
		}
	}	
	public static void main(String[]Args){
		LoopWhileExample loopWhileExample= new LoopWhileExample();
		loopWhileExample.ModOftwo(10,15);
		loopWhileExample.RangeOfNumbers(10,30);
		loopWhileExample.DevisibleAndNumber(5,18);
		loopWhileExample.DivisiableOrNumber(5,40);	
	}
}