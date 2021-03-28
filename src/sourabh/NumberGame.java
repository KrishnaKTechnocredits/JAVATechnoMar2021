package sourabh;

class NumberGame{
	void  findMaxNumber(int a, int b, int c){
		if(a==b && a==c && b==c)
			System.out.println("Maximum number could not found, All given numbers equal numbers");		
		else if(a>b && a>c)
			System.out.println("Maximum number is "+a);
		else if (b>a && b>c)
			System.out.println("Maximum number is "+b);	
		else
			System.out.println("Maximum number is "+c);			
	}
	void findMinNumber(int a, int b, int c){
		if(a==b && a==c && b==c)
			System.out.println("Minimum number could not found, All given numbers equal numbers");		
		else if(a<b && a<c)
			System.out.println("Minimum  number is "+a);
		else if (b<a && b<c)
			System.out.println("Minimum  number is "+b);	
		else
			System.out.println("Minimum  number is "+c);		
	}
	public static void main(String[] args){
		NumberGame numberGame= new NumberGame();
		numberGame.findMaxNumber(30, 50, 70);
		numberGame.findMinNumber(96, 96, 96);
	}	
}
