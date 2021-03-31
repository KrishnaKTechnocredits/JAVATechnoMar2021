package monali;
class Calculator{
   int x =2;
   int y =5;
   
   void add(){
	    int Answer = x + y;
		System.out.println("Addition of two variable is" +Answer);
		}
		
	void sub(){
		int Answer = x - y;
		System.out.println("Subtraction of two variable is "+Answer);
	}
	
	void mul(){
		int Answer = x * y;
		System.out.println("Multiplication of two variable is"+Answer);
	}
	
	void div(){
		int Answer = x / y;
		System.out.println("Division of two variabls is"+Answer);
	}
	
     public static void main(String[] args){
		 Calculator Calculator = new Calculator();
		 Calculator.add();
		 Calculator.sub();
		 Calculator.mul();
		 Calculator.div();
	 }
	 
	
}




     
	
	 


	
	
    


	 