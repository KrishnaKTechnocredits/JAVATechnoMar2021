package rashmi;

public class Whileloop {
	
	
	void evenNumber(int startLimit, int endLimit) {
		
		System.out.println("even numbers are : ");
		while(startLimit<=endLimit) {
			
			if(startLimit%2==0) {
				
				System.out.println(startLimit);
			}
				startLimit++;
		
						
				
		}
	}
		
		
		void divby5(int startLimit, int endLimit) {
			
			System.out.println("Numbers divisible by 5 are : ");
			
			while(startLimit<=endLimit) {
				
				if(startLimit%5==0) {
					
					System.out.println(startLimit);
				}
					startLimit++;
			
							
					
			}
		}
		
		void divby5and3(int startLimit, int endLimit) {
		
		System.out.println("NUmbers divisible by both 5 and 3 are : ");
			while(startLimit<=endLimit) {
			 
			 if(startLimit%5==0 && startLimit%3==0) {
				 
			 System.out.println(startLimit);
				
			 }
			 startLimit++;
			}
			
	}

	
	void divby7or13(int startLimit, int endLimit) {
	
	System.out.println("NUmbers divisible by both 7 or 13 are : ");
	while(startLimit<=endLimit) {
		 
		 if(startLimit%5==0 || startLimit%3==0) {
			 
		 System.out.println(startLimit);
			
		 }
		 startLimit++;
		}
}

    public static void main(String[] args) {
    	Whileloop whileloop = new Whileloop();
    	whileloop.evenNumber(2, 10);
    	whileloop.divby5(5, 20);
    	whileloop.divby5and3(1, 15);
    	whileloop.divby7or13(11, 60);
}
}