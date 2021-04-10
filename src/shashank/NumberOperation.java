//WAP to find the square and cube of a number
package shashank;
class NumberOperation
{
	public void square(int num1){
	  System.out.println ("Square of "+num1+" is "+(num1*num1));
    }
	public void cube(int num2){
	  System.out.println ("Cube of "+num2+" is "+(num2*num2*num2));
    }
	public static void main(String args [])
	{
		NumberOperation numberop = new NumberOperation();
		numberop.square(12);
		numberop.cube(25);
		
	}
}