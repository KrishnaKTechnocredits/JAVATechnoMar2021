package pallavi.Assignment_1;
class Calculator{
   int x=20;
   int y=5;
   void add(){
     int answer = x+y;
	 System.out.println("Addition of two varaible is " + answer);
   }

   void sub(){
     int answer = x-y;
	 System.out.println("Subtraction of two varaible is " + answer);
   }
   
   void multiply(){
     int answer = x*y;
	 System.out.println("Multiplication of two varaible is " + answer);
   }
   
   void division(){
     int answer = x/y;
	 System.out.println("Division of two varaible is " + answer);
   }
   
   
   public static void main(String args[]){
   Calculator cal = new Calculator();
   cal.add();
   cal.sub();
   cal.multiply();
   cal.division();
   
   }
}