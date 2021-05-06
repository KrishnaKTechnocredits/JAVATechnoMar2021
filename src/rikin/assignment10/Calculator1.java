package rikin.assignment10;

class Calculator1{
	
	int add(int a, int b){
		int c = a+b;
		return c;
	}	
	int sub(int a, int b){
		int c = a-b;
		return c;
	}
	int mul(int a, int b){
		int c = a*b;
		return c;
	}
	int div(int a, int b){
		int c = a/b;
		return c;
	}
	
	void printTotal(int addAnswer, int subAnswer, int mulAnswer, int divAnswer){
		int totalAnswer = addAnswer + subAnswer + mulAnswer + divAnswer;
		System.out.println("Total answer is " + totalAnswer);
	}
	
	public static void main(String [] args){
		Calculator1 calculator1 = new Calculator1();
		int addAnswer = calculator1.add(10,20);//30
		int subAnswer = calculator1.sub(20,10);//10
		int mulAnswer = calculator1.mul(5,5);//25
		int divAnswer = calculator1.div(10,5);//2	
		
		calculator1.printTotal(addAnswer,subAnswer,mulAnswer,divAnswer);
	}	
}