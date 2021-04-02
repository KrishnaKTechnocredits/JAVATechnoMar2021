package renuka;

class Division{
	
	void evenNumbers(int rangeStart,int rangeStop) {
		System.out.println("Even numbers are:");
		for(int i=rangeStart;i<=rangeStop;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
				
		}
		
	}
	
	void divisibleBy5(int rangeStart,int rangeStop) {
		
		System.out.println("Numbers divisible by 5 are:");
		for(int i=rangeStart;i<=rangeStop;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
			
		}
		
		
	}
	
	void divisibleBy3and5(int rangeStart,int rangeStop){
		
		System.out.println("Numbers divisible by 3 and 5 are:");
		for(int i=rangeStart;i<=rangeStop;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}	
		}
	}

    void divisibleBy7and13(int rangeStart,int rangeStop) {

		int num1=7,num2=13;
        System.out.println("Numbers divisible by 7 or 13 are:");
        for(int i=rangeStart;i<=rangeStop;i++) {
            if(i%num1==0) 
                System.out.println(i+ " is divisible by "+ num1);
            else if(i%num2==0)
                System.out.println(i+ " is divisible by "+ num2);
         }
     } 
     public static void main(String[] args) {
      
    	 Division d=new Division();
         d.evenNumbers(10,15);
         d.divisibleBy5(10,30);
         d.divisibleBy3and5(5,18);
         d.divisibleBy7and13(5, 40);
     }

}
