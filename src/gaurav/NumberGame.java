package gaurav;

//Assignment 4

class NumberGame{
	
	void findMaxNumber(int a,int b,int c){
		if(a>b&&b>c){
			System.out.println("Maximum number is " + a);
		}
		else if(b>a&&b>c){
			System.out.println("Maximum number is " + b);
		}
		else if(c>a&&c>b){
			System.out.println("Maximum number is " + c);
		}
		else if((a==b)&&(b==c)&&(c==a)){
			System.out.println("Maximum number could not found,all given numbers equal numbers");
		}
	}
	void findMinNumber(int a,int b,int c){
		if(a<b&&b<c){
			System.out.println("Minimum number is " + a);
		}
		else if(b<a&&b<c){
			System.out.println("Minimum number is " + b);
		}
		else if(c<a&&c<b){
			System.out.println("Minimum number is " + c);
		}
		else if((a==b)&&(b==c)&&(c==a)){
			System.out.println("Minimum number could not found,all given numbers equal numbers");
		}
	}
	public static void main(String[]args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13,4,19);
		numberGame.findMaxNumber(13,13,13);
		numberGame.findMinNumber(13,4,19);
		numberGame.findMinNumber(13,13,13);
	}	
}