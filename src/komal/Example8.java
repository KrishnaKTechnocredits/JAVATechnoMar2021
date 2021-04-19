package komal;

class Example8{
	int x = 10;
	int y = 20;
	
	void add(int num1, int num2){
	int ans = num1 + num2;
	System.out.println("Addition is " + ans);
	}
	public static void main(String[] args){
		Example8 example8 = new Example8();
		example8.add(10,12);
	}
}