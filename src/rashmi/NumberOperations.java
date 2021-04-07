package rashmi;
public class NumberOperations{
	
	//int squresult;
	//int cuberesult;
	
	void squarenum(int num){
		int squresult = num * num;
	    System.out.println("Square of number is " + squresult);

	}
	
	void cubenum(int num){
		 int cuberesult = num * num * num;
		 System.out.println("Cube of number is " + cuberesult);
	}
	
	/*void display(){
		System.out.println("Square of number is " + squresult);
		System.out.println("Cube of number is " + cuberesult);
	}*/
	
	public static void main(String[] args){
		NumberOperations numberoperations = new NumberOperations();
		numberoperations.squarenum(2);
		numberoperations.cubenum(4);
		//numberoperations.display();
	}
}
		
		