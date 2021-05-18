package rikin.assignment4;

class NumberGame{
	
	void findMaxNumber(int a, int b, int c){
		if(a==b && a==c){
			System.out.println("Maximum number could not found, all given numbers are identical. " );
		}else if(a > b && a > c){
			System.out.println(	a + " is maximum number. ");
		}else if (b > c){
			System.out.println( b + " is maximum number. " );
		}else{
			System.out.println( c + " is maximum number. " );
		}
	}		

	void findMinNumber(int a, int b, int c){
		if(a==b && a==c){
			System.out.println("Minimum number can not found, all given numbers are identical. ");
		}else if(a < b && a < c){
			System.out.println(a + " is minimum number. " );
		}else if(b < c){
			System.out.println(b + " is minimum number. " );
		}else{
			System.out.println(c + " is minimum number. " );
		}
	}
	
	public static void main (String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13,13,13);
		numberGame.findMaxNumber(13,4,19);
		numberGame.findMinNumber(13,13,13);
		numberGame.findMinNumber(13,4,19);
	}
}