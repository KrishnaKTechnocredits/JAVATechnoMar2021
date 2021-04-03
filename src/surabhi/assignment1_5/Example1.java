package surabhi.assignment1_5;

/*
 * 
 * Assignment num 2
 * */
class Example1{

	void square(int num){
		int ans=num*num;
		System.out.println("Square of a number is :" +ans);
	}
	void cube(int num){
		int ans=num*num*num;
		System.out.println("Cube of a number is :" +ans);	
	}
	public static void main(String args[]){
		Example1 exm1=new Example1();
		exm1.square(2);
		exm1.cube(2);
	}

}