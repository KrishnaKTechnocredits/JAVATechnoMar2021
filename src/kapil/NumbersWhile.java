//WHILE LOOP
// Print Even numbers.
// Print  Numbers which is divisible by 5
// Print Numbers which is divisible by 5 and 3.
// Print Numbers which is divisible by 7 or 13. 
package kapil;

public class NumbersWhile {

	void evenNum(int endNumber) {
		int num =10;
		while(num <= endNumber) {
			if(num%2 ==0) 
			System.out.println("Numbers are even = "+num);
			num++;
		}
	}
	
	void divBy5(int totalNumber) {
		int count = 1;
		int num = 1;
		while(count <= totalNumber) {
			if(num%5 == 0) {
				System.out.println("Numbers are divisible by 5 = "+num);
				count = count+ 1;
			}
			num = num +1;
		}
	}	
	
	void divBy5and3(int totalNumber) {
		int count = 1;
		int num =1;
		while(count <= totalNumber) {
		if(num%5 == 0 && num%3 == 0) {
			System.out.println("Numbers are Divisible by 5 and 3 = "+num);
			count = count +1;
		}    
		num = num + 1;
	  }			
	}
	void divBy7or13(int endNumber) {
		int num =5;
		while(num <= endNumber) {
			if(num%7 ==0 || num%13 == 0) 
			System.out.println("Numbers are divisible by 7 or 13 = "+num);
			num++;
		}
	}
    public static void main(String[] args) {
        NumbersWhile numberwhile = new NumbersWhile();
        numberwhile.evenNum(15);
        numberwhile.divBy5(2);
        numberwhile.divBy5and3(3);
        numberwhile.divBy7or13(40);
     }  
}