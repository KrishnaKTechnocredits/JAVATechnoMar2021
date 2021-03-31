//Assignment 2

package rupali;
class SquareCube{
	
	void sqcb(int n){
		System.out.println("The square of  "+n+" is "+n*n);
		System.out.println("The cube of  "+n+" is "+n*n*n);
	}
	
	public static void main(String[] args){
		
		int number;
		SquareCube squarecube1=new SquareCube();
		number=10;
		squarecube1.sqcb(number);
		squarecube1.sqcb(15);
	}
}


