package pallavi;

class Operation{
	int num;
	int result;
	
	void square(int num){
    result=num*num;
	System.out.println("Square of the two number is = " + result);
	}
 
	void cube(int num){
	result=num*num*num;
	System.out.println("Cube of the two number is = " + result);
	}
	
	public static void main(String args[]){
	Operation operation = new Operation();
	operation.square(3);
	operation.cube(5);
	
	
	}
}