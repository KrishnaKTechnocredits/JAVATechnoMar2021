package nikita;

public class SquareCube {

	void square(int num)
	{
		int a= num*num;
		
		System.out.println("The square of number is: "+a);
		
	}
	
	void cube(int no)
	{
		int b=no*no*no;
		System.out.println("The cube of number is: "+b);		
	}
	
public static void main(String args[])
{
	SquareCube sq= new SquareCube();
	sq.square(2);
	sq.cube(3);
}
}
