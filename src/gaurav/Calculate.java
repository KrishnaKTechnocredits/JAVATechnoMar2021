package gaurav;

//WAP to find the square and cube of a number. 
// Assignment 2
class Calculate{
	
    void square(int no1,int no2)
   {
    int ans = no1*no2;
	System.out.println("square is "+ans);
   }
   void cube(int num1,int num2,int num3)
   {
    int ans1 = num1*num2*num3;
	System.out.println("cube is "+ans1);
   }
   public static void main(String[]args)
   {
     Calculate calculate1 = new Calculate();
	 calculate1.square(10,10);
	 calculate1.cube(12,12,12);
   }	 
   
 }  