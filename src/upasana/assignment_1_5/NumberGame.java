package upasana;

class NumberGame{

	void findMaxNumber(int x,int y,int z){
		
		if(x==y && y==z){
			System.out.println("Maximum number could not found,All given numbers are identical");
		}
		else if(x>y && x>z){
			System.out.println("Maximum number is "+x);
		}
		
		else if(y>z){
			System.out.println("Maximum number is "+y);
		}
		
		else{
			System.out.println("Maximum number is "+z);
		}
		
	}
	void findMinNumber(int x,int y,int z){
		
		if(x==y && y==z){
			System.out.println("Minimum number could not found,All given numbers equal numbers");
		}
		else if(x<y && x<z){
			System.out.println("Minimum number is "+x);
		}
		
		else if(y<z){
			System.out.println("Minimum number is "+y);
		}
		
		else{
			System.out.println("Minimum number is "+z);
		}
	}
	 
	 public static void main(String[] args){
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13,4,19);
		numberGame.findMinNumber(13,4,19);
		numberGame.findMaxNumber(13,13,13);
		numberGame.findMinNumber(13,13,13);
	}
}
	
