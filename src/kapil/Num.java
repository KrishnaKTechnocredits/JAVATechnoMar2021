// Print even num 10 to 15.
// Print numbers divisible by 5.
// Print numbers divisible by 5 and 3.
// Print numbers divisible by 7 or 13.


package kapil;

public class Num {
	
    void evenNum(int startlimit,int endlimit) {
    	
    	for(int index = startlimit; index<=endlimit; index++) {
    		  if(index%2 == 0)
    			    System.out.println("Number is Even "+index);
    	}
    		
    		
    }
    
    void divby5(int startlimit, int endlimit) {
    	for(int index = startlimit; index<=endlimit; index++) {
    		if(index%5 == 0)
    			  System.out.println("Numbers are divisible by 5 " +index);
    	}
    }	
    	
    void diviby5and3(int startlimit, int endlimit) {
    	for(int index = startlimit; index<=endlimit; index++) {
    		if(index%5 == 0 && index%3 ==0)
    			System.out.println("Numbers are divisible by 5 and 3 "+index);
    	}
    }		
    
    void divisby7or13(int startlimit ,int endlimit) {
    	for(int index = startlimit; index<=endlimit; index++) {
    		if(index%7 == 0 || index%13 == 0)
    			System.out.println("Numbers are divisible by 7 or 13 are "+index);
    	}
    }
 public static void main(String[] args) {
	   Num num = new Num();
	   num.evenNum(10,15);
	   num.divby5(10, 30);
	   num.diviby5and3(5, 18);
	   num.divisby7or13(5, 40);
 }
}
